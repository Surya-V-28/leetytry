
public class ContinousSubArrays {

    public static void main(String args[]) {
        System.out.println("Working on the String");
        int[] nums = {5, 4, 2, 4};
        int currentMin = Integer.MAX_VALUE;
        long count = 0;
        int CurrentMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                currentMin = Math.min(nums[i], currentMin);
                CurrentMax = Math.max(nums[j], CurrentMax);
                if ((CurrentMax - currentMin) <= 2 && (CurrentMax - currentMin) >= 0) {
                    count++;

                }
            }
        }

        System.out.println("the answer for the Question " + count);
    }
}
