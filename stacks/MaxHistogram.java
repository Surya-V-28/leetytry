
import java.util.Stack;

public class MaxHistogram {

    public int[] calculatingPreSum(int[] nums) {
        int[] preSum = new int[nums.length];
        for (int i = 0; i < preSum.length; i++) {
            preSum[i] = -1;

        }

        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < nums.length; i++) {

            while (!stk.isEmpty() && nums[i] < nums[stk.peek()]) {
                stk.pop();
            }

            if (!stk.isEmpty()) {
                preSum[i] = stk.peek();
            }
            stk.push(i);
        }
        return preSum;

    }

    public int[] calculatingnextSum(int[] nums) {
        int[] nextSum = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            nextSum[i] = nums.length;
        }

        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            while (!stk.isEmpty() && nums[i] < nums[stk.peek()]) {
                nextSum[stk.pop()] = i;

            }

            stk.push(i);

        }

        return nextSum;

    }

    public static void main(String[] args) {
        System.out.println("Working on the answers");
        int[] nums = {60, 20, 50, 40, 10, 50, 60};
        MaxHistogram obj = new MaxHistogram();
        int[] preSum = obj.calculatingPreSum(nums);
        int[] nextSum = obj.calculatingnextSum(nums);

        int maxAns = 0;

        for (int i = 0; i < nums.length; i++) {
            int width = nextSum[i] - preSum[i] - 1;
            int currMax = nums[i] * width;
            maxAns = Math.max(currMax, maxAns);

        }

        System.out.println("the answer for the histogram is " + maxAns);

    }
}
