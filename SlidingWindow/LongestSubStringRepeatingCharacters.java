
import java.util.HashMap;

class Solution {

    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freqs = new HashMap<>();
        int res = 0, left = 0, maxFreq = 0;

        for (int right = 0; right < s.length(); right++) {
            freqs.put(s.charAt(right), freqs.getOrDefault(s.charAt(right), 0) + 1);
            maxFreq = Math.max(maxFreq, freqs.get(s.charAt(right)));
            while ((right - left + 1) - maxFreq > k) {
                freqs.put(s.charAt(left), freqs.get(s.charAt(left)) - 1);
                left++;
            }
            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}
