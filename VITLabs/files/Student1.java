import java.io.*;
import java.util.*;

public class Student1 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.println("How many Students");
        n = inp.nextInt();
        Student[] s1 = new Student[n];
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        // Serialization
        try {
            fos = new FileOutputStream("ObjectStream.txt");
            oos = new ObjectOutputStream(fos);
            for (int i = 0; i < n; i++) {
                s1[i] = new Student();
                s1[i].get();
                oos.writeObject(s1[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        // Deserialization
        try {
            fis = new FileInputStream("ObjectStream.txt");
            ois = new ObjectInputStream(fis);
            System.out.println("Stored Objects are...");
            while (fis.available() > 0) {
                Student student = (Student) ois.readObject();
                student.display();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (ois != null) ois.close();
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static class Student implements Serializable {
        String id, name, gender, program;
        int age;
        static int currNo;

        void get() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your id : ");
            id = sc.next();
            sc.nextLine();
            System.out.println("Enter your name : ");
            name = sc.nextLine();
            System.out.println("Enter your age : ");
            age = sc.nextInt();
            System.out.println("Enter your gender : ");
            gender = sc.next();
            System.out.println("Enter your program : ");
            program = sc.next();
            System.out.println("Enter your CurrNo : ");
            currNo = sc.nextInt();
        }

        void display() {
            if (program.equals("MCA")) {
                System.out.println("Id : " + id);
                System.out.println("Name : " + name);
                System.out.println("Age : " + age);
                System.out.println("Gender : " + gender);
                System.out.println("Program : " + program);
                System.out.println("Program : " + currNo );

            } else {
                System.out.println("Student does not belong to MCA");
            }
        }
    }
}
