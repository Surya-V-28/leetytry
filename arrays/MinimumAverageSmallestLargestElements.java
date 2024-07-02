
import java.util.*;

public class MinimumAverageSmallestLargestElements {
    public static void main(String args[]) {
        System.out.println("Wokring");
        int[] nums = {7,8,3,4,15,13,4,1};
        double currMin= Double.MAX_VALUE;
        Arrays.sort(nums);
        int i =0, j=nums.length-1;
        while(i<=j){
            double val = (nums[i] + nums[j])/2.0;
            currMin = Math.min(val,currMin);
            i++;
            j--;
        }
        System.out.println(currMin);




    }
}