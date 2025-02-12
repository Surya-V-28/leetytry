
class Solution {

    public int longestMonotonicSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Initialize both counters and the max length.
        int inc = 1, dec = 1, max = 1;

        // Start from the second element and iterate once.
        for (int i = 1; i < nums.length; i++) {
            // Check for increasing sequence.
            if (nums[i] > nums[i - 1]) {
                inc++;
            } else {
                inc = 1;  // Reset if the sequence is broken.
            }

            // Check for decreasing sequence.
            if (nums[i] < nums[i - 1]) {
                dec++;
            } else {
                dec = 1;  // Reset if the sequence is broken.
            }

            // Update the maximum length encountered.
            max = Math.max(max, Math.max(inc, dec));
        }

        return max;
    }

    public static void main(String[] args) {

    }

    public int longestMonotonicSubarrayI(int[] nums) {
        int counter = 1, dcounter = 1;
        int maxInc = 0, maxDec = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                counter++;
            } else {
                maxInc = Math.max(maxInc, counter);
                counter = 1;
            }
        }
        maxInc = Math.max(maxInc, counter);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                dcounter++;
            } else {
                maxDec = Math.max(maxDec, dcounter);
                dcounter = 1;
            }
        }
        maxDec = Math.max(maxDec, dcounter);
        return (maxDec > maxInc) ? maxDec : maxInc;
    }

}
