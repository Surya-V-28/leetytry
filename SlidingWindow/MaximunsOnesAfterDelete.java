


import java.util.*;


public class MaximunsOnesAfterDelete {
    public static void main(String args[]) {
        System.out.println("Working no");
        int[] nums = {0,1,1,1,0,1,1,0,1};
        int count=0;
        int k=1;
        int j=0, i=0;
        int maxSum=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            while(count>k){
                if(nums[j]==0){
                    count--;
                }
                j++;
            }
           maxSum = Math.max(maxSum, i-j);
        }
        System.out.println(maxSum);
    }
}