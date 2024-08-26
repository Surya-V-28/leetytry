

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
        System.out.println("Enter the Account number of the user for IndianBank");
        accountNumber = sc.nextLong();
        System.out.println("Enter the Account Holder Name  for IndianBank");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Enter the Current balance  for IndianBank ");
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
        System.out.println("Enter the Account number of the user for ICICBank");
        accountNumber = sc.nextLong();
        System.out.println("Enter the Account Holder Name for ICICBank");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Enter the Current balance for ICICBank");
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
        System.out.println("Enter the Account number of the user for CUB");
        accountNumber = sc.nextLong();
        System.out.println("Enter the Account Holder Name for CUB");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Enter the Current balance for CUB ");
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
        obj1.gettingInput();
        obj1.calculateinterest();
        obj1.printDetails();


        RBI obj2 = new CUB();
        obj2.gettingInput();
        obj2.calculateinterest();
        obj2.printDetails();
    }
}