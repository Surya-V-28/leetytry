import java.io.*;

// A class implementing Serializable
class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;          // Non-static field
    private transient int age;    // Transient field (will not be serialized)
    private  String country;
    
    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
    // Static field (will not be serialized)
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();  // Serialize non-transient fields
        oos.writeInt(age);
        // Manually serialize the age field
    }
    // Custom deserialization logic
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();   // Deserialize non-transient fields
        age = ois.readInt();       // Manually deserialize the age field
    }


    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", country='" + country + "'}";
    }
}



public class Serials {
    public static void main(String[] args) {
        // Create a Person object
        Person person1 = new Person("Alice", 30, "USA");
        Person person2 = new Person("Bob", 25, "Canada");
        Person person3 = new Person("Charlie", 28, "UK");
        // Serialize multiple Person objects to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persons.txt"))) {
            oos.writeObject(person1); // javac -d . filename
            oos.writeObject(person2);
            oos.writeObject(person3);
            System.out.println("Objects Serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Deserialize multiple Person objects from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persons.txt"))) {
            Person deserializedPerson1 = (Person) ois.readObject();
            Person deserializedPerson2 = (Person) ois.readObject();
            Person deserializedPerson3 = (Person) ois.readObject();
            System.out.println("Deserialized: " + deserializedPerson1);
            System.out.println("Deserialized: " + deserializedPerson2);
            System.out.println("Deserialized: " + deserializedPerson3);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
