
import java.util.*;

public class SecondLargest {

    public static void bruteForce(int[] arr) {
        Arrays.sort(arr);
        int largest = arr[arr.length - 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            if (largest != arr[i]) {
                System.out.println("Printing the answers" + arr[i]);
                break;
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("Working");
        int[] nums = {12, 35, 1, 10, 34, 1};
        bruteForce(nums);

    }
}
