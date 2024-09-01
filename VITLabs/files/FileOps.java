
import java.io.FileInputStream;
import java.io.IOException;

public class FileOps {
    public static void main(String[] args) throws IOException {
        try (FileInputStream inputStream = new FileInputStream("example.txt")) {
            byte[] buffer = new byte[1000]; // Read 10 bytes at a time
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                // Convert bytes to String and print
                System.out.println(new String(buffer, 0, bytesRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOps {
   
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("example.txt");
        System.out.println("Content of the file is:");
        int c;
        while (fin.available() > 0) {  // Check if there are available bytes to read
            c = fin.read();            // Read the next byte
            System.out.print((char)c); // Print the character read from the file
        }
        fin.close();  // Close the fi
    }
}
