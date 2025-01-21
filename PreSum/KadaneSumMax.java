
import java.util.*;

class KadaneSumMax {

    int maxLen(int arr[]) {
        // code here
        int currSum = 0;
        int ans = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum == 0) {
                ans = Math.max(ans, i + 1);
            }
            if (hash.containsKey(currSum)) {
                ans = Math.max(ans, i - hash.get(currSum));
            }
            if (!hash.containsKey(currSum)) {
                hash.put(currSum, i);
            }
        }
        return ans;

    }
}
