
import  java.util.*;


public class MaxiumOperationKpointers {
    public static void main(String[] args) {
        System.out.println("Working");
        int[] nums = {3,1,3,4,3};
        int k=6;
        int result =0;

        Arrays.sort(nums);
        int i=0;
        int j = nums.length-1;

        while(i<j){
            if(nums[i]+nums[j]==k){
                result++;
                i++;
                j--;
            }
            else if(nums[i]+nums[j]<k){
                i++;
            }
            else if (nums[i]+nums[j]>k){
                j--;
            }
        }
        System.out.println(" the answers is " + result);

    }
}