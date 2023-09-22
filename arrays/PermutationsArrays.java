


import java.util.*;


public class PermutationsArrays {
    public static void  main(String args[]){
        System.out.println("working");
        int[] nums  = {5,0,1,2,3,4};
        aPermutation(nums,0);
        for(int val:nums){
            System.out.println(val);
        }

    }

    static void aPermutation(int[] nums,int start){
        if(start<nums.length){
        int temp=nums[start];
        System.out.println("Start atb i  "+ start);
        int result=nums[temp];
        aPermutation(nums,start+1);
        System.out.println("Start at "+ start);
        nums[start]=result;
      

    }}
}