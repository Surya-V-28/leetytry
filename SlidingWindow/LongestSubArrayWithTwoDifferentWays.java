
import java.util.*;

class Solution {

    public static int totalElements(Integer[] arr) {
        // code here
        HashMap<Integer, Integer> s = new HashMap<>();
        int left = 0;
        int ans = 0;
        for (int right = 0; right < arr.length; right++) {
            s.put(arr[right], s.getOrDefault(arr[right], 0) + 1);
            while (s.size() > 2) {
                s.put(arr[left], s.get(arr[left]) - 1);
                if (s.get(arr[left]) == 0) {
                    s.remove(arr[left]);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
