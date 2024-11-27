
import java.io.IOException;
import java.rmi.*;

public interface RMIInterface extends Remote {

    int sumoftwo(int a, int b) throws IOException;

}
