
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {

    public static void main(String args[]) {
        try {

            // System.setSecurityManager(new RMISecurityManager());
            RMIServer ser = new RMIServer();

            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost/SumService", ser);
            System.out.println("Server waiting...");

        } catch (java.net.MalformedURLException me) {
            System.out.println("Malformed URL: " + me.toString());
        } catch (RemoteException e) {
            System.err.println(e);
        }

    }

}
