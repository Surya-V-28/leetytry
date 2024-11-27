
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;

public class Client {

    public static void main(String[] args) {

        try {

            RMIInterface rmi = (RMIInterface) Naming.lookup("rmi://localhost/SumService");
            int result = rmi.sumoftwo(5, 10);
            System.out.println("The sum is: " + result);

        } catch (IOException | NotBoundException e) {
            System.err.println("erros");
        }
    }
}
