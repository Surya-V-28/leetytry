import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int serverPort = 5000;

        try (Socket socket = new Socket(serverAddress, serverPort)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Connected to server.");

            System.out.print("Enter operation (e.g., 'A + B'): ");
            String operation = console.readLine();

            // Send operation to server
            out.println(operation);

            // Receive and display result
            String result = in.readLine();
            System.out.println("Server response: " + result);

        } catch (IOException e) {
            System.err.println("Client exception: " + e.getMessage());
        }
    }
}
