class Parent {
     void staticMethod() {
        System.out.println("Static method in Parent");
    }
}

class Child extends Parent {
     void staticMethod() {
        System.out.println("Static method in Child");
    }
}

public class OverRiden {
    public static void main(String[] args) {
        // Parent.staticMethod(); // Output: Static method in Parent
        // Child.staticMethod();  // Output: Static method in Child
        
        Parent p = new Child();
        p.staticMethod(); // Output: Static method in Parent (resolved based on reference type)
        Parent p2 = new Parent();
        p2.staticMethod();
    }
}
