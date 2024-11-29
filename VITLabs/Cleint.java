
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cleint {

    public static void main(String[] args) {
        Socket sc = null;
        try {
            sc = new Socket("localhost", 1234);
            BufferedReader in = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            PrintWriter out = new PrintWriter(sc.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String msg = in.readLine();
                System.err.println(" Mssg for the Server  " + msg);
                if (msg.equalsIgnoreCase("exit")) {
                    System.err.println("Server Dissconnected this the TCP");
                    break;
                }
                System.err.println("Replay to the server");
                String reply = scanner.nextLine();
                out.println("Mssg sent form Client" + reply);
            }
            sc.close();
        } catch (Exception e) {
            System.err.println("Error happend");
        }

    }
}
