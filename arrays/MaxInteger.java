
import java.util.*;

public class MaxInteger {

    public static void main(String[] args) {
        System.out.print("working as fine");
        int currMax = -1;
        int[] nums = {3, 9, 2, 1, 7};
        int k = 3;

        HashMap<Integer, Integer> hash = new HashMap<>();
        // selecting the first elements subarrays limit 

        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            if (entry.getValue() == 1) {
                currMax = Math.max(currMax, entry.getKey());
            }
        }
    }
}
