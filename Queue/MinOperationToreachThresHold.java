
import java.util.*;

class Solution {

    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> arr = new PriorityQueue<>();
        for (int num : nums) {
            arr.add((long) num);
        }

        int counter = 0;

        while (arr.size() > 1 && arr.peek() < k) {
            long x = arr.poll();
            long y = arr.poll();
            long ans = Math.min(x, y) * 2 + Math.max(x, y);
            arr.add(ans);
            counter++;
        }
        return counter;
    }
}
