
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {

        try {

            ServerSocket sc = new ServerSocket(1234);
            Socket socket = sc.accept();
            System.err.println("Client is Connected");
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.err.println("Send a msg to Client");
                String msg = scanner.nextLine();
                out.println(" ---" + msg);

                System.err.println("Server ----");
                String re = in.readLine();
                System.err.println(re);

                if (msg.equalsIgnoreCase("exit")) {
                    System.err.println("Disconneted by Server");
                    break;
                }

            }
            socket.close();
        } catch (Exception e) {
            System.err.println("Works");
        } finally {
        }
    }
}
