
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Server is listening on port 1234...");

      
        Socket socket = serverSocket.accept();
        System.out.println("Client connected!");

      
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Input from client
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // Output to client

        Scanner sc = new Scanner(System.in);

       
        while (true) {
       
            String clientMessage = in.readLine();
            if (clientMessage == null || clientMessage.equalsIgnoreCase("exit")) {
                System.out.println("Client disconnected.");
                break;
            }
            System.out.println("Client says: " + clientMessage);

          
            System.out.print("Enter your message to client: ");
            String serverResponse = sc.nextLine();
            out.println(serverResponse);

            if (serverResponse.equalsIgnoreCase("exit")) {
                System.out.println("Connection closed by server.");
                break;
            }
        }

        
        socket.close();
        serverSocket.close();
        sc.close();
    }
}