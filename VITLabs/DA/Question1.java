
import java.util.Scanner;

class Flight {
    String name;
    long number;
    int seatNo;
    String seatType;
    int flightNo;

    Flight(String _name, long _number, int _seatNo, String _seatType, int _flightNo) {
        name = _name;
        number = _number;
        seatNo = _seatNo;
        seatType = _seatType;
        flightNo = _flightNo;
    }
}

public class Question1 {
    static int currCount = 0;
    static String[] f1seat;
    static String[] f2seat;

    public static void flightdetails() {
        System.out.println("1. List of flight details");
        System.out.println("Flight 1            Flight 2");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + f1seat[i] + "       " + i + " - " + f2seat[i]);
        }
    }

    public static void listOfPassengerDetails(Flight[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].name != null) {
                System.out.println("Passenger no: " + (i + 1));
                System.out.println("Name: " + users[i].name);
                System.out.println("Mobile No: " + users[i].number);
                System.out.println("Seat No: " + users[i].seatNo);
                System.out.println("Seat Type: " + users[i].seatType);
                System.out.println("Flight No: " + users[i].flightNo);
                System.out.println();
            }
        }
        System.out.println("End of passenger details");
    }

    public static void getDetailsForBooking(Flight[] flg, int seatNo, int flightNo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nice, the seat is available");
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Please enter your mobile number: ");
        long mobile = sc.nextLong();
        String seatType = (seatNo < 4) ? "First Class" : "Second Class";
        flg[currCount] = new Flight(name, mobile, seatNo, seatType, flightNo);
        currCount++;
        System.out.println("You have successfully booked");
    }

    public static void reverseBooking(Flight[] flg) {
        Scanner sc = new Scanner(System.in);
        flightdetails();
        System.out.println("These are the available seats, pick which you want");
        System.out.println("Enter the flight number you want to book (1 or 2): ");
        int flightNo = sc.nextInt();
        System.out.println("Enter the seat number (0-9): ");
        int seatNo = sc.nextInt();

        if (flightNo == 1) {
            if (f1seat[seatNo].equals("Available")) {
                f1seat[seatNo] = "Reserved";
                getDetailsForBooking(flg, seatNo, flightNo);
            } else {
                System.out.println("You did not get the booking, it's already booked");
            }
        } else if (flightNo == 2) {
            if (f2seat[seatNo].equals("Available")) {
                f2seat[seatNo] = "Reserved";
                getDetailsForBooking(flg, seatNo, flightNo);
            } else {
                System.out.println("You did not get the booking, it's already booked");
            }
        } else {
            System.out.println("Invalid flight number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Flight[] flg = new Flight[20];
        int val = 1;

        do {
            System.out.println("Enter your choice of input:");
            System.out.println("1. List of flight seats");
            System.out.println("2. List of passenger details");
            System.out.println("3. Reservations");
            System.out.println("4. Stop");
            int cho = sc.nextInt();

            switch (cho) {
                case 1:
                    flightdetails();
                    break;
                case 2:
                    listOfPassengerDetails(flg);
                    break;
                case 3:
                    reverseBooking(flg);
                    break;
                case 4:
                    val = 0;
                    break;
                default:
                    System.out.println("Wrong choice");
            }

            if (val != 0) {
                System.out.println("Do you wish to continue? Yes = 1, No = 0");
                val = sc.nextInt();
            }
        } while (val == 1);
    }

    static {
        f1seat = new String[10];
        f2seat = new String[10];
        for (int i = 0; i < 10; i++) {
            f1seat[i] = "Available";
            f2seat[i] = "Available";
        }
    }
}
