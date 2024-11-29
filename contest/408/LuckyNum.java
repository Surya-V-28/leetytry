import java.util.Arrays;

public class Solution {
    public int nonSpecialCount(int l, int r) {
        boolean[] isPrime = sieveOfEratosthenes((int)Math.sqrt(r));
        int countSpecial = 0;

        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                int primeSquare = i * i;
                if (primeSquare >= l && primeSquare <= r) {
                    countSpecial++;
                }
            }
        }

        int totalNumbers = r - l + 1;
        return totalNumbers - countSpecial;
    }

    private boolean[] sieveOfEratosthenes(int max) {
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

   
}
