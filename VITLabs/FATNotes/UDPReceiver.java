import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9876);

        byte[] buffer = new byte[1024];

        // Keep listening for incoming packets
        while (true) {
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            socket.receive(packet);

            // Extract the received message and split it to get the numbers
            String receivedData = new String(packet.getData(), 0, packet.getLength());
            String[] numbers = receivedData.split(" ");

            int num1 = Integer.parseInt(numbers[0]);
            int num2 = Integer.parseInt(numbers[1]);

            // Perform addition and print the result
            int sum = num1 + num2;
            System.out.println("Received numbers: " + num1 + " and " + num2);
            System.out.println("Sum: " + sum);

            // Optionally, stop the loop after receiving a certain number of packets
            // You can add a condition to stop after a certain count
            // For now, it will keep receiving indefinitely.
        }

        // socket.close(); // This is unreachable code because of infinite loop
    }
}
