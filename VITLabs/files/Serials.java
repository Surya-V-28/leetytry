import java.io.*;

// A class implementing Serializable
class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;          // Non-static field
    private transient int age;    // Transient field (will not be serialized)
    private static String country; // Static field (will not be serialized)

    // Constructor
    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        Person.country = country;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", country='" + country + "'}";
    }
}

public class Serials {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Alice", 30, "USA");

        // Serialize the Person object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Modify static and non-static fields
        person = new Person("Bob", 25, "Canada");

        // Deserialize the Person object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))) {
            Person deserializedPerson = (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
