

public class CheckifArraySorted {
    public static void main(String[] args) {
        System.out.print("Working");
        int[] nums = {3,4,5,1,2};
        boolean checker = false;
        int count =0;
        int minValue = nums[0];
        int minIndex = 0;
        int n = nums.length;

        // Loop through the array to find the minimum value and its index
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
                minIndex = i;
            }
        }
        System.out.println(minIndex);
       int i = minIndex;
        while(i++>=0){
            if(nums[i%n] > nums[(i+1)%n]){
                System.out.println("Wrong");
                count++;
                break;
            }
            if(count==nums.length) {
                System.out.println("Right");
                break;
            }

        }

    }
}