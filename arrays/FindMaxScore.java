
import java.util.*;

public class FindMaxScore {

    public static void main(String args[]) {
        int[] nums = {2, 3, 5, 1, 3, 2};
        int[] copied = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copied);
        int score = 0;
        int numsIndex = 0;
        boolean[] visited = new boolean[nums.length];
        while (numsIndex < nums.length) {
            for (int i = 0; i < nums.length; i++) {
                if (copied[numsIndex] == nums[i] && !visited[i]) {
                    System.out.println("found the output index at  i " + i);
                    score += copied[numsIndex];
                    visited[i] = true;
                    int low = i - 1;
                    int high = 1 + i;
                    if (low >= 0 && high < nums.length) {
                        visited[low] = true;
                        visited[high] = true;

                    } else if (high > nums.length) {
                        visited[low] = true;

                    } else if (low < 0) {
                        visited[high] = true;
                    }

                    break;
                }

            }
            numsIndex++;
        }

        System.out.println("ans is " + score);

    }
}
