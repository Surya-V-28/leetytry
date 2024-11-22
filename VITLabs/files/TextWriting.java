import java.io.*;

public class TextWriting {
    public static void main(String[] args) {
        String filename = "persons.txt"; // File to write to
        String newContent = "Surya is here what does need buddy.\n";

        // Append new content to the file using byte streams
        try (FileOutputStream fos = new FileOutputStream(filename, true)) { // 'true' enables append mode
            byte[] contentBytes = newContent.getBytes(); // Convert the string to a byte array
            fos.write(contentBytes); // Append the byte array to the file
            System.out.println("Text appended to " + filename + " successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the entire content of the file using byte streams
        try (FileInputStream fis = new FileInputStream(filename)) {
            int byteData;
            String readContent = "";
            // Read byte by byte and append to the StringBuilder
            while ((byteData = fis.read()) != -1) {
                readContent+=((char) byteData);
            }

            // Output the content read from the file
            System.out.println("Content read from file:\n" + readContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
