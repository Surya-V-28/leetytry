import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPSenders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // To take user input

        try {
            DatagramSocket socket = new DatagramSocket();
            // Use localhost for sending to the same machine
            InetAddress address = InetAddress.getByName("localhost");
            // Send multiple packets
            for (int i = 0; i < 3; i++) { // Let's send 3 packets
                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();
                // Send the numbers as a string, separated by space
                String message = num1 + " " + num2;
                DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), address, 9876);
                socket.send(packet); 
                System.out.println("Sent numbers: " + num1 + " and " + num2);
                Thread.sleep(500); // Wait 500ms before sending next packet (optional)
            }

            socket.close();
            scanner.close();  // Close the scanner after use

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
