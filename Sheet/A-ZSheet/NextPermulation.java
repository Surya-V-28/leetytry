
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NextPermulation {

    public static void swap(int a, int b, int[] nums) {

    }

    public static void main(String args[]) {
        int[] nums = {3, 2, 1};
        boolean lastDigit = false;
        int indexToSwap = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                indexToSwap = i - 1;
                lastDigit = true;
                break;
            }
        }
        System.err.println("the index of the break point " + indexToSwap);

        if (!lastDigit) {
            int temp = nums[indexToSwap];

            int minNumber = Integer.MAX_VALUE;
            // find out the number and get the number which is the litter greather than that 
            for (int i = indexToSwap + 1; i < nums.length; i++) {
                if (temp < nums[i]) {
                    minNumber = Math.min(nums[i], minNumber);
                }
            }
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " , ");

            }
            for (int i = indexToSwap + 1; i < nums.length; i++) {
                if (minNumber == nums[i]) {
                    nums[i] = temp;
                    nums[indexToSwap] = minNumber;
                    break;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " , ");

            }
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = indexToSwap + 1; i < nums.length; i++) {
                arr.add(nums[i]);
            }
            Collections.sort(arr);
            System.out.println(arr);
            int j = 0;
            for (int i = indexToSwap + 1; i < nums.length; i++) {
                nums[i] = arr.get(j++);

            }

        } else {
            Arrays.sort(nums);
        }

    }
}
