import java.rmi.*;

public class FactorialClient {
    public static void main(String[] args) {
        try {
            // Lookup the remote object
            FactorialService service = (FactorialService) Naming.lookup("rmi://localhost:5000/factorialService");

            // Call the remote method
            int number = 5; // Example input
            long result = service.calculateFactorial(number);

            // Display the result
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (Exception e) {
            System.err.println("Client error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
