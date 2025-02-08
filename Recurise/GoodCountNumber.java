
public class GoodCountNumber {

    public static long recurise(long exp, long base, int mod) {

        if (exp == 0) {
            return 1;
        }

        long half = recurise(exp / 2, base, mod);
        long result = half * half;
        if (exp % 2 == 1) {
            result = (result * base) % mod;
        }
        return result % mod;
    }

    public static void main(String args[]) {

        System.out.println("Wokring");
        int mod = 100000007;
        long n = 4;
        long e = (n + 1) / 2;
        long o = n / 2;
        long ans = (recurise(e, 5, mod) * recurise(o, 4, mod)) % mod;
        System.err.println("answer " + ans);

    }
}
