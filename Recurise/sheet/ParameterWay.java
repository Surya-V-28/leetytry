
public class ParameterWay {

    public int callWithParameterForSumOfNumbers(int n, int sum, int total) {
        if (n > total) {
            return sum;
        }
        System.out.println("the current Surm is " + sum);
        return callWithParameterForSumOfNumbers(n + 1, sum + n, total);
    }

    public static void main(String args[]) {
        System.out.println("Working on the answers");
        ParameterWay way = new ParameterWay();

        int ans = way.callWithParameterForSumOfNumbers(0, 0, 5);
        System.out.println("answer is " + ans);
    }
}
