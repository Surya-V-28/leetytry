import java.util.*;
class Geometry {
    float x, y;
    String color;

    Geometry(float x,float y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    void printDetails() {  
        System.out.println("Printing the detials in the parent class");
        System.out.println("The Cordinates of X and Y " +x  + " And " + y );
    }

}

class Cricle  extends Geometry {
    float radius, area;
    final static float pi = 3.14f;
    Cricle(float x,float y, String color,float radius) {
        super(x,y,color);
        this.radius = radius;
        area = pi*radius*radius;
    }
    void printDetails() {
        super.printDetails();
        System.out.println(" The radius of the cricle is " + radius);
        System.out.println(" The Area of the cricle is " + area);
        System.out.println(" The Color of the cricle is " + super.color);
    }

}

class Rectangle extends Geometry {
    float length, width, area;
    Rectangle(float x,float y, String color, float length, float width){
        super(x,y,color);
        this.length = length;
        this.width = width;
        area =  length * width;
    }
    void printDetails() {
        super.printDetails();
        System.out.println(" The Length of the Rectangle is " + length);
        System.out.println(" The Width of the Rectangle is " + width);
        System.out.println(" The Area of the Rectangle is " + area);
        System.out.println(" The Color of the Rectangle is " + super.color);
    }
}

public class Question2 {
    public static void main(String args[]) {
        Geometry obj = new Cricle(5, 10, "Red", 7); // dynamic dispatch methods calling the parent obj under the child class
        System.out.println("\n Cricle Details:");
        obj.printDetails();
        Geometry rectangle = new Rectangle(15, 20, "Blue", 12, 8);
        System.out.println("\nRectangle Details:");
        rectangle.printDetails();
    }
}

