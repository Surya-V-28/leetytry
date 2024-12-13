
public class NextPermulation {

    public static void swap(int a, int b, int[] nums) {

    }

    public static void main(String args[]) {
        System.out.println("Working");
        int[] nums = {1, 2, 3};

        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[i];
            for (int j = i - 1; j >= 0; j--) {
                if (temp > nums[j]) {
                    swap(temp, nums[j], nums);
                    nums[i] = nums[j];
                    nums[j] = temp;
                    break;
                }

            }

        }

        for (int elem : nums) {
            System.out.println(elem);

        }

    }
}
