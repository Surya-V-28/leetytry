class Student {
    static int regno;
}

public class Practice {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.regno = 101;
        Student student2 = new Student();
        System.out.println("Student 1 RegNo: " + student1.regno);
        System.out.println("Student 2 RegNo: " + student2.regno);
    }
}

