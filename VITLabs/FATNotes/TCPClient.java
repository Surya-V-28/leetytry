
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        
        Socket socket = new Socket("localhost", 1234);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Send message to server
            System.out.print("Enter your message to server: ");
            String clientMessage = sc.nextLine();
            out.println(clientMessage);

            if (clientMessage.equalsIgnoreCase("exit")) {
                System.out.println("Connection closed by client.");
                break;
            }

            // Receive response from server
            String serverResponse = in.readLine();
            if (serverResponse == null || serverResponse.equalsIgnoreCase("exit")) {
                System.out.println("Server disconnected.");
                break;
            }
            System.out.println("Server says: " + serverResponse);
        }

        // Clean up
        socket.close();
        sc.close();

    }
}