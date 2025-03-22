
/**
 * Equal Partition Sum Problem
 * This class provides three different approaches to solve the equal partition sum problem:
 * 1. Recursive approach
 * 2. Memoization approach (Top-down DP)
 * 3. Tabulation approach (Bottom-up DP)
 *
 * Problem: Given an array, determine if it can be partitioned into two subsets with equal sum
 */
public class EqualSubsetTargetSum {

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 5, 11, 5};         // Should return true (can be divided into [1,5,5] and [11])
        int[] arr2 = {1, 3, 5};             // Should return false
        int[] arr3 = {2, 2, 3, 5};          // Should return false
        int[] arr4 = {4, 4, 9, 3, 2, 6};    // Should return true

        // Test and display results for all approaches
        System.out.println("Recursive Approach:");
        System.out.println("arr1: " + recursiveEqualPartition(arr1));
        System.out.println("arr2: " + recursiveEqualPartition(arr2));
        System.out.println("arr3: " + recursiveEqualPartition(arr3));
        System.out.println("arr4: " + recursiveEqualPartition(arr4));

        System.out.println("\nMemoization Approach:");
        System.out.println("arr1: " + memoizationEqualPartition(arr1));
        System.out.println("arr2: " + memoizationEqualPartition(arr2));
        System.out.println("arr3: " + memoizationEqualPartition(arr3));
        System.out.println("arr4: " + memoizationEqualPartition(arr4));

        System.out.println("\nDP Approach:");
        System.out.println("arr1: " + dpEqualPartition(arr1));
        System.out.println("arr2: " + dpEqualPartition(arr2));
        System.out.println("arr3: " + dpEqualPartition(arr3));
        System.out.println("arr4: " + dpEqualPartition(arr4));
    }

    /**
     * Approach 1: Recursive solution Time Complexity: O(2^n) - exponential, as
     * we try 2 choices for each element Space Complexity: O(n) - recursion
     * stack depth
     */
    static boolean recursiveEqualPartition(int arr[]) {
        // Calculate total sum of array elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // If sum is odd, it cannot be divided into two equal parts
        if (sum % 2 == 1) {
            return false;
        }

        // Target sum for each partition
        int target = sum / 2;

        // Start recursive function to find if partition is possible
        return canPartitionRecursive(arr, 0, target);
    }

    /**
     * Helper recursive function to check if subset with given sum is possible
     *
     * @param arr The input array
     * @param index Current index being considered
     * @param target Remaining target sum to achieve
     * @return true if partition is possible, false otherwise
     */
    private static boolean canPartitionRecursive(int[] arr, int index, int target) {
        // Base cases
        if (target == 0) {
            return true;  // Found a valid subset

                }if (index == arr.length || target < 0) {
            return false;  // Out of elements or target becomes negative
        }
        // Two choices: include current element or skip it
        // 1. Include current element
        boolean take = canPartitionRecursive(arr, index + 1, target - arr[index]);

        // 2. Exclude current element
        boolean notTake = canPartitionRecursive(arr, index + 1, target);

        // Return true if either choice leads to a solution
        return take || notTake;
    }

    /**
     * Approach 2: Memoization solution (Top-down Dynamic Programming) Time
     * Complexity: O(n * sum) where n is array length and sum is total sum of
     * elements Space Complexity: O(n * sum) + O(n) for recursion stack
     */
    static boolean memoizationEqualPartition(int arr[]) {
        // Calculate total sum of array elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // If sum is odd, it cannot be divided into two equal parts
        if (sum % 2 == 1) {
            return false;
        }

        // Target sum for each partition
        int target = sum / 2;

        // Initialize memoization array with -1 (unprocessed states)
        int[][] memo = new int[arr.length][target + 1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= target; j++) {
                memo[i][j] = -1;  // -1 means not computed yet
            }
        }

        // Start memoized recursive function
        return canPartitionMemo(arr, 0, target, memo) == 1;
    }

    /**
     * Helper memoized recursive function
     *
     * @param arr The input array
     * @param index Current index being considered
     * @param target Remaining target sum to achieve
     * @param memo Memoization array to store computed results
     * @return 1 if partition is possible, 0 otherwise
     */
    private static int canPartitionMemo(int[] arr, int index, int target, int[][] memo) {
        // Base cases
        if (target == 0) {
            return 1;  // Found a valid subset

                }if (index == arr.length || target < 0) {
            return 0;  // Out of elements or target becomes negative
        }
        // If result is already computed, return it
        if (memo[index][target] != -1) {
            return memo[index][target];
        }

        // Two choices: include current element or skip it
        // 1. Include current element if it doesn't exceed target
        int take = 0;
        if (arr[index] <= target) {
            take = canPartitionMemo(arr, index + 1, target - arr[index], memo);
        }

        // 2. Exclude current element
        int notTake = canPartitionMemo(arr, index + 1, target, memo);

        // Store result in memo table before returning
        memo[index][target] = (take == 1 || notTake == 1) ? 1 : 0;
        return memo[index][target];
    }

    /**
     * Approach 3: Dynamic Programming solution (Bottom-up Tabulation) Time
     * Complexity: O(n * sum) where n is array length and sum is total sum of
     * elements Space Complexity: O(n * sum) for the DP table
     */
    static boolean dpEqualPartition(int arr[]) {
        // Calculate total sum of array elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // If sum is odd, it cannot be divided into two equal parts
        if (sum % 2 == 1) {
            return false;
        }

        // Target sum for each partition
        int target = sum / 2;

        // Initialize DP table
        boolean[][] dp = new boolean[arr.length][target + 1];

        // Initialize first column: empty subset can achieve sum=0
        for (int i = 0; i < arr.length; i++) {
            dp[i][0] = true;
        }

        // Initialize first row: only possible to achieve arr[0] sum with first element
        if (arr[0] <= target) {
            dp[0][arr[0]] = true;
        }

        // Fill the dp table
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= target; j++) {
                // Don't take current element
                boolean notTake = dp[i - 1][j];

                // Take current element if possible
                boolean take = false;
                if (arr[i] <= j) {
                    take = dp[i - 1][j - arr[i]];
                }

                // Current state is possible if either choice leads to a solution
                dp[i][j] = take || notTake;
            }
        }

        // Final result is stored in bottom-right cell
        return dp[arr.length - 1][target];
    }
}
