import java.net.*;
import java.io.*;

public class UDPSender {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket();
            InetAddress broadcastAddress = InetAddress.getByName("255.255.255.255"); // Broadcast address
            String message = "Hello UDP Broadcast";

            byte[] buffer = message.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, broadcastAddress, 5000);

            System.out.println("Broadcasting message: " + message);
            socket.send(packet);
        } catch (IOException e) {
            System.err.println("Error in sender: " + e.getMessage());
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }
}
