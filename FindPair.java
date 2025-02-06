
import java.util.Scanner;

public class FindPair {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the number of rows
        // int N = scanner.nextInt();
        int N = 5;

        // Initialize the first number of each row
        int currentNumber = 1;

        // Generate and print the pattern
        for (int i = 1; i <= N; i++) {
            int startNumber = currentNumber;
            for (int j = 0; j < i; j++) {
                System.out.print(startNumber + " ");
                startNumber -= (i - j);
            }
            currentNumber += i;
            System.out.println();
        }
    }
}
