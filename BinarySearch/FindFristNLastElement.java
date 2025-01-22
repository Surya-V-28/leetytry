
class Solution {

    int lowerBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int lastLow = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else { // Move towards the first occurrence of the target
                lastLow = mid;
                high = mid - 1;
            }
        }
        return lastLow;
    }

    int upperBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int lastHigh = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) { // Move towards the last occurrence of the target
                lastHigh = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return lastHigh;
    }

    public int[] searchRange(int[] nums, int target) {
        int lower = lowerBound(nums, target);
        int upper = upperBound(nums, target);

        if (lower == -1 || nums[lower] != target) {
            return new int[]{-1, -1}; // Target not found

                }return new int[]{lower, upper};
    }
}
