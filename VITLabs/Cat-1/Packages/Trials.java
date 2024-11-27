
import mypack.Dog;
import mypack.Animals;
// Main class
public class Trials {
    public static void main(String[] args) {
        Dog myDog = new Dog();
       // Inherited method
        myDog.bark(); // Subclass method
        Animals myAnimal = new Animals();
        myAnimal.bark();
        
    }
}