


import java.util.*;

public class FindHigestAptitude1732 {
    public  static void main(String args[]) {
        System.out.println("Working");
        int[] nums = {-5,1,5,0,-7};
        int[] nums2 = new int[nums.length+1];

        for(int i=0;i<nums.length;i++){
            nums2[i+1] = nums[i] + nums2[i];
        }

        for(int val:nums2){
            System.out.println(val);
        }
    
    }
    public  static void anotherWayWithOutExtraSpace(int[] nums) {
        int sum=0;
        int maxSum= 0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxSum = Math.max(maxSum,sum);
        }
        
    }
}