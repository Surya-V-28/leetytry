
public class BinarySubArraySum {

    public int findSubArrrays(int[] nums, int goal) {
        if (goal < 0) {
            return 0;
        }
        int left = 0;
        int currSum = 0;
        int count = 0;
        for (int right = 0; right < nums.length; right++) {
            currSum += nums[right];
            while (currSum > goal && left < nums.length) {
                currSum -= nums[left];
                left++;
            }
            count += (right - left) + 1;
        }
        return count;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return findSubArrrays(nums, goal) - findSubArrrays(nums, goal - 1);

    }
}
