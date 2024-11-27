import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server is listening on port 5000...");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected.");

                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                // Read operation from client
                String operation = in.readLine();
                System.out.println("Received operation: " + operation);

                // Perform calculation
                String[] parts = operation.split(" ");
                if (parts.length != 3) {
                    out.println("Invalid format. Use 'A + B'");
                } else {
                    try {
                        double operand1 = Double.parseDouble(parts[0]);
                        String operator = parts[1];
                        double operand2 = Double.parseDouble(parts[2]);

                        double result = switch (operator) {
                            case "+" -> operand1 + operand2;
                            case "-" -> operand1 - operand2;
                            case "*" -> operand1 * operand2;
                            case "/" -> operand2 != 0 ? operand1 / operand2 : Double.NaN;
                            default -> Double.NaN; // Invalid operator
                        };

                        if (Double.isNaN(result)) {
                            out.println("Error: Invalid operation or division by zero.");
                        } else {
                            out.println("Result: " + result);
                        }
                    } catch (NumberFormatException e) {
                        out.println("Error: Operands must be numbers.");
                    }
                }
                socket.close();
            }
        } catch (IOException e) {
            System.err.println("Server exception: " + e.getMessage());
        }
    }
}
