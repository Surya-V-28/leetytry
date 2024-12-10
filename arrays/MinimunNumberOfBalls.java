
import java.util.*;

public class MinimunNumberOfBalls {

    public static boolean canDivide(int penalty, int[] nums, int maxOperations) {
        int operations = 0;
        for (int num : nums) {
            if (num > penalty) {
                // Calculate the number of splits required to reduce the size <= penalty
                operations += (num - 1) / penalty;
            }
            if (operations > maxOperations) {
                return false; // Exceeds allowed operations
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("working");
        int[] nums = {9};
        int maxOperations = 2;

        // Binary search for the minimum penalty
        int left = 1;
        int right = Arrays.stream(nums).max().getAsInt();
        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canDivide(mid, nums, maxOperations)) {
                result = mid; // Update the result to the current penalty
                right = mid - 1; // Try smaller penalty
            } else {
                left = mid + 1; // Increase penalty
            }
        }
        System.out.println("Minimum possible penalty: " + result);
    }
}
