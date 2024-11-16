import java.rmi.*;
import java.rmi.server.*;

public class FactorialServer extends UnicastRemoteObject implements FactorialService {

    // Constructor
    public FactorialServer() throws RemoteException {
        super();
    }

    // Implementation of the factorial method
    @Override
    public long calculateFactorial(int number) throws RemoteException {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            // Create and bind the server object
            FactorialService service = new FactorialServer();
            Naming.rebind("rmi://localhost:5000/factorialService", service);
            System.out.println("Factorial Service is ready.");
        } catch (Exception e) {
            System.err.println("Server error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
