


import java.util.*;
import java.lang.*;


public class ContainerWithMostWater {
    public static void main(String args[]){
        System.out.println("working");
        int[] nums = {1,8,6,2,5,4,8,3,7};;
        int left =0,right=nums.length-1;
        int finas=0;
      while(left<right){
        int arrarea = Math.min(nums[left],nums[right]) * (right-left);
        finas = Math.max(finas,arrarea);
        if(nums[left]<nums[right]){
            left++;
        } else {
            right--;
        } 
      }
      System.out.println(finas);
    }
}