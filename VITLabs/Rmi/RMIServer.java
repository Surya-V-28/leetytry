
import java.io.IOException;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer extends UnicastRemoteObject implements RMIInterface {

    protected RMIServer() throws RemoteException {
        super();
    }

    @Override
    public int sumoftwo(int a, int b) throws IOException {
        return a + b;
    }

}
