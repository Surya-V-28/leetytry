import java.rmi.Remote;
import java.rmi.RemoteException;

// Remote interface
public interface FactorialService extends Remote {
    long calculateFactorial(int number) throws RemoteException;
}
