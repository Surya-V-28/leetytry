
public class SpecialDiscount {

    public static void main(String[] args) {

        System.out.println("Error is happeing ");
        int nums[] = {8, 4, 6, 2, 3};
        int k = 0;
        boolean curr = false;
        for (int i = 0; i < nums.length; i++) {
            curr = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    nums[k++] = nums[i] - nums[j];
                    curr = true;
                    break;
                }
            }
        }

        for (int elem : nums) {
            System.out.println(elem);

        }
    }
}
