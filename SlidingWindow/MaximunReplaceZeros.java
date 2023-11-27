


import java.util.*;



public class MaximunReplaceZeros {
    public static void main(String args[]) {
        System.out.println("Wokring surya");
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;
        int j=0,i=0;
        int maxSum=0;
        int anotherCount;

        for(i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                k--;
            }
            if(k<0){ 
                if(nums[j]==0) k++;
                j++;
            }
        }
        maxSum = i-j;
        System.out.println(maxSum);
       
    }
}