
import java.util.*;

public class KnackSapZeroandOne {

    public int memo(int index, int sum, int[] coins, int[][] dp) {

        if (sum == 0) {
            return 0;
        }
        if (index >= coins.length) {
            return 100;
        }

        if (dp[index][sum] != -1) {
            return dp[index][sum];
        }

        int notTake = memo(index + 1, sum, coins, dp);
        int take = 100;
        if (sum >= coins[index]) {
            take = 1 + memo(index, sum - coins[index], coins, dp);
        }

        dp[index][sum] = Math.min(take, notTake);
        return dp[index][sum];
    }

    public int minCoins(int coins[], int sum) {
        // code here
        int[][] dp = new int[coins.length][sum + 1];

        for (int i = 0; i < coins.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        Arrays.sort(coins);

        int ans = memo(0, sum, coins, dp);
        for (int[] elem : dp) {
            for (int i : elem) {
                System.out.print(i + " ,");
            }
            System.out.println("");
        }
        return (ans >= 100) ? -1 : ans;

    }

    public static void main(String[] args) {
        int[] coins = {25, 10, 5};
        int sum = 30;
        KnackSapZeroandOne obi = new KnackSapZeroandOne();

        System.out.println("The Sum of the Values is " + obi.minCoins(coins, sum));
    }

}
