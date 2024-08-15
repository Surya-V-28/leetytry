

import java.util.*;


abstract class  RBI {
    abstract void gettingInput();
    abstract void printDetails();
    abstract void calculateinterest();
}

class IndianBank extends RBI {
    static Long  accountNumber;
    static double balance, interest;
    String name;
    public void gettingInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account number of the user");
        accountNumber = sc.nextLong();
        System.out.println("Enter the Account Holder Name");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Enter the Current balance ");
        balance = sc.nextDouble();
    
    }
    public void calculateinterest() {
        balance = balance + (balance * interest)/100;

    }
    public void printDetails() {
        System.out.println("This is Indian Bank Details");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + name);
        System.out.println("The interest Rate of the Indain Bank : " + interest);
        System.out.println("The Balance along with interest : " + balance);
    }
    static {
        interest = 7.9;
    }

}

class ICICBank  extends RBI {
    static Long  accountNumber;
    static double balance, interest;
    String name;
    public void gettingInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account number of the user");
        accountNumber = sc.nextLong();
        System.out.println("Enter the Account Holder Name");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Enter the Current balance ");
        balance = sc.nextDouble();
    
    }
    public void calculateinterest() {
        balance = balance + (balance * interest)/100;

    }
    public void printDetails() {
        System.out.println("This is ICIC Bank Details");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + name);
        System.out.println("The interest Rate of the ICIC Bank : " + interest);
        System.out.println("The Balance along with interest : " + balance);
    }
    static {
        interest = 5.9;
    }
}

class CUB extends RBI {
    static Long  accountNumber;
    static double balance, interest;
    String name;
    
    public void gettingInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account number of the user");
        accountNumber = sc.nextLong();
        System.out.println("Enter the Account Holder Name");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Enter the Current balance ");
        balance = sc.nextDouble();
    
    }

    public void calculateinterest() {
        balance = balance + (balance * interest)/100;

    }
    public void printDetails() {
        System.out.println("This is CUB Bank Details");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + name);
        System.out.println("The interest Rate of the CUB Bank : " + interest);
        System.out.println("The Balance along with interest : " + balance);
    }
    static {
        interest = 4.9;
    }

}



public class Three {
    public static void main(String args[]){
        System.out.println("Working");
        RBI obj = new ICICBank();
        obj.gettingInput();
        obj.calculateinterest();
        obj.printDetails();

        RBI obj1 = new IndianBank();
        obj.gettingInput();
        obj.calculateinterest();
        obj.printDetails();


        RBI obj2 = new CUB();
        obj.gettingInput();
        obj.calculateinterest();
        obj.printDetails();
    }
}