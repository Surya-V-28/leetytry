
import java.util.ArrayList;
import java.util.Arrays;

public class MaximunScoreSubSequence {

    static Long ans = 0L;
    static long[][] dp;

    public static int sumOfArrays(ArrayList<Integer> arr) {
        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        return sum;
    }

    public static int minofArrays(ArrayList<Integer> q) {
        int sum = Integer.MAX_VALUE;
        for (int elem : q) {
            sum = Math.min(sum, elem);
        }
        return sum;
    }

    public static void backTrack(ArrayList<Integer> arr, ArrayList<Integer> q, int k, Long ans, int[] nums1, int[] nums2, int start) {
        if (arr.size() == k) {
            int sumofArr = sumOfArrays(arr);
            int minQueue = minofArrays(q);
            ans = Math.max(ans, (long) sumofArr * minQueue);
            return;
        }
        for (int j = start; j < nums1.length; j++) {
            arr.add(nums1[j]);
            q.add(nums2[j]);
            backTrack(arr, q, k, ans, nums1, nums2, j + 1);
            arr.remove(arr.size() - 1);
            q.remove(q.size() - 1);
        }
    }

    public static long DpApproach(int[] nums1, int[] nums2, int ans, int k) {
        int n = nums1.length;
        dp = new long[n + 1][k + 1];

        // Initialize DP array
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], 0);
        }
        dp[0][0] = 0; // Base case: 0 elements selected, score is 0.

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                // Option 1: Exclude current element
                dp[i][j] = dp[i - 1][j];

                // Option 2: Include current element if possible
                if (j > 0) {
                    dp[i][j] = Math.max(
                            dp[i][j],
                            dp[i - 1][j - 1] + nums1[i - 1] * nums2[i - 1]
                    );
                }
            }
        }

        // Print the entire DP matrix
        System.out.println("Final DP Table:");
        printMatrix(dp);

        return dp[n][k];
    }

    // Helper function to print the matrix
    public static void printMatrix(long[][] matrix) {
        for (long[] row : matrix) {
            for (long value : row) {
                if (value == Long.MIN_VALUE) {
                    System.out.print("MIN\t");
                } else {
                    System.out.print(value + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 3, 2}, nums2 = {2, 1, 3, 4};
        int k = 3;
        // ArrayList<Integer> arr = new ArrayList<>();
        // ArrayList<Integer> q = new ArrayList<>();
        // System.out.println(" The starting array is here " + arr.size());
        // System.out.println(" The starting Queue  is here " + q);
        // backTrack(arr, q, k, ans, nums1, nums2, 0);
        // System.out.println("the answe using the Dp approach is ");

        System.out.println(DpApproach(nums1, nums2, k, k));

        for (int i = 0; i <= nums1.length; i++) {
            for (int j = 0; j <= k; j++) {
                System.out.print(dp[i][j] + " , ");

            }
            System.out.println("");

        }

    }
}
