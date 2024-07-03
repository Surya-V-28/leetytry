import java.util.*;

public class GreddyApproach {
    public static void main(String args[]){
        System.out.println("Working");
        int[] nums = {1,5,0,10,14};
        System.out.println(nums.length);
        int n = nums.length;
        if(nums.length<=4) {
            System.out.println("0 answers");
        }
        else {
        Arrays.sort(nums);
        int min1 = Math.min(nums[n-1]-nums[3],nums[n-2]-nums[2]);
        int min2 = Math.min(nums[n-3]-nums[1],nums[n-4]-nums[0]);
        int min = Math.min(min1, min2);
        System.out.println(min);
        }

    }
}