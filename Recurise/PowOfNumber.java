
class PowOfNumber {

    public double ans(double x, long n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / ans(x, -n);
        }
        double half = ans(x, n / 2); // Store result to avoid duplicate calls
        if (n % 2 == 0) {
            return half * half; // If n is even
        } else {
            return x * half * half; // If n is odd
        }
    }

    public double myPow(double x, int n) {
        return ans(x, (long) n);
    }
}
