
import java.util.*;

public class primeNumbers {

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Wokring on the code");
        int start = 1;
        int end = 10;
        boolean[] prime = new boolean[end + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        // starts for the loop two 
        for (int i = 2; i * 1 <= end; i++) {
            if (prime[i]) {
                for (int j = i * i; j < end; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int i = 0; i <= end; i++) {
            if (prime[i]) {
                System.out.println(i + ", ");
            }
        }

    }
}
