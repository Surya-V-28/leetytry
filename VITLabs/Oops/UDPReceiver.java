import java.net.*;
import java.util.*;
import java.io.*; 

public class UDPReceiver {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(5000); // Port must match the sender's port
            System.out.println("Receiver is waiting for broadcast messages...");

            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            // Receive the broadcast message
            socket.receive(packet);

            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received message: " + message);

            // Compute the count of each character
            Map<Character, Integer> charCount = new HashMap<>();
            for (char c : message.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

            // Display the character counts
            System.out.println("Character count:");
            charCount.forEach((key, value) -> System.out.println(key + ": " + value));

        } catch (IOException e) {
            System.err.println("Error in receiver: " + e.getMessage());
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }
}
