
public class MaximunScoreObtain {

    public static void bruteForce() {
        System.out.println("Working");
        int nums[] = {11, 49, 100, 20, 86, 29, 72};
        int k = 4;
        int i = 0, j = nums.length - 1;
        int sum = 0;
        while (k > 0) {
            if (nums[i] <= nums[j]) {
                sum += nums[j];
                System.out.println("nums i " + nums[i] + " , " + nums[j]);
                j--;
                k--;
            } else {
                sum += nums[i];
                System.out.println("nums i " + nums[i] + " , " + nums[j]);
                i++;
                k--;
            }
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        int cardPoints[] = {};
        // 1 2  3  4  5  6  7 
        int k = 3;

        int[] preSum = new int[cardPoints.length];
        preSum[0] = cardPoints[0];
        for (int i = 1; i < cardPoints.length; i++) {
            preSum[i] = preSum[i - 1] + cardPoints[i];
        }
        for (int elem : preSum) {
            System.out.print(elem + " , ");
        }
        int ans = preSum[6] - preSum[4];
        // nums of length  - nums of length -k

        for (int i = 0; i < k; i++) {
            int count = preSum[cardPoints.length - 1] - preSum[cardPoints.length - 1 - i] + preSum[i];
            ans = Math.max(ans, count);
        }
        System.out.print(ans);

    }

}

class Solution {

    public int maxScore(int[] cardPoints, int k) {
        int[] preSum = new int[cardPoints.length];
        preSum[0] = cardPoints[0];

        // Calculate prefix sum
        for (int i = 1; i < cardPoints.length; i++) {
            preSum[i] = preSum[i - 1] + cardPoints[i];
        }
        int ans = preSum[k - 1]; // Case: All k cards are taken from the front.
        // Iterate over all combinations of front and back
        for (int i = 0; i <= k; i++) {
            int frontSum = i > 0 ? preSum[i - 1] : 0; // First i cards
            int backSum = (k - i > 0 && cardPoints.length - 1 - (k - i) >= 0)
                    ? (preSum[cardPoints.length - 1]
                    - preSum[cardPoints.length - 1 - (k - i)])
                    : 0; // Last k - i cards
            ans = Math.max(ans, frontSum + backSum);
        }

        return ans;
    }
}
