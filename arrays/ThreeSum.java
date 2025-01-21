
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ThreeSum {

    public static HashSet<ArrayList<Integer>> OptimalSolution(String[] args) {
        System.out.println("wokring in the ansewers");

        int[] nums = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums);
        HashSet<ArrayList<Integer>> ans = new HashSet<>();
        int target = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] > target) {
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < target) {
                    j++;

                } else {
                    ArrayList<Integer> arr = new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(nums[k]);
                    ans.add(arr);
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }

                    // Move pointers
                    j++;
                    k--;

                }
            }

        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println("wokring in the ansewers");

        int[] nums = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums);
        HashSet<ArrayList<Integer>> ans = new HashSet<>();
        int target = 0;

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] > target) {
                    k--;
                } else if (nums[i] + nums[j] + nums[k] == target) {
                    ArrayList<Integer> arr = new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(nums[k]);
                    ans.add(arr);
                    k--;
                    j++;

                } else {
                    j++;

                }
            }

        }

        // Outside of THE LOOP
        // printing the values of the answers 
        System.out.println(ans);

    }

}
