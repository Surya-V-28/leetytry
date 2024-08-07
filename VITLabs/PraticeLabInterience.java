import java.util.*;
public class PraticeLabInterience {


    public  static void main(String args[]) {
        System.out.println("Wokring");
        Student obj = new Student();
        obj.getInput();
        obj.printing();
    }
}

class Person {
    public int id;
    public long mobile;
    public String name;
    
    // Person(int _id, String _name, long _mobile){
    //     id = _id;
    //     name =_name;
    //     mobile = _mobile;
    // }

    public void getInput() {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the Name of the Student");
         name = sc.nextLine();
         System.out.println("Enter the id of Student");
         id = sc.nextInt();
        System.out.println("Enter the mobile number of the student");
         mobile = sc.nextLong();
         
    }
    public void printing() {
        System.out.println("Printing the details of the students");
        System.out.println("Name: " + name);
        System.out.println("Register Id : " + id);
        System.out.println("Mobile : " + mobile);
    }
}



class Student extends Person {
    public int mark1, mark2, mark3;
    public  int result, avg;

    
    public void getInput() {
        super.getInput();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark one of the Student");
       mark1 = sc.nextInt();
       System.out.println("Enter the mark two of the Student");
       mark2 = sc.nextInt();
       System.out.println("Enter the mark three of the Student");
       mark3 = sc.nextInt();
    }
    public int  findResult()  {
        return (mark1 + mark2 + mark3)/3;

    }
    public void printing() {
       super.printing();
       if (mark1<50 || mark2<50 || mark3< 50 ) {System.out.println("Failed" );}
        else {System.out.println("Passed" );}
       System.out.println("The average mark of the student is :" + findResult());
    }

}