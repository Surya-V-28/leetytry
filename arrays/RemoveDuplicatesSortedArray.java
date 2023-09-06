


import java.util.*;


public class RemoveDuplicatesSortedArray { 
    public static void main(String args[]){
        System.out.println("Working");
        int[] nums = {1,1,1,1,2,3,4,6,6,7};
        int[] ans = new int [nums.length];
        int count=0,news =0,i;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
            else {
                 nums[news] = nums[i];
                news++;
            }  
        }
        nums[news] = nums[i];
        arrayhelper.arrayPrinter(nums);
       
    }
}