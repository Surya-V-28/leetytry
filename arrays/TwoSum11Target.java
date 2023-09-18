

import java.util.*;


public class TwoSum11Target {
    public static void main(String[] args) {
        System.out.println("Working with surya");
        int[] nums = {2,3,4};
        int target = 6; 

        int start=0, last = nums.length-1;
        while(start<last) {
            if(nums[start] + nums[last] <target){
                start++;
            }
            else if(nums[start] + nums[last] >target) {
                last--;
            }
            else if(nums[start] + nums[last] ==target){
              
                break;
            }
        }
        System.out.println("this is last and first  " + start + "the last  "+ last);

        
    }
}

 class TwoSum11TargetDifferentWays {
    public static void BruteForceMethod(int[] nums, int target) {
        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    System.out.println("this is the Ith and Jth " + i +" jth " + j);
                    break;
                }
            }
        }
    }

 }