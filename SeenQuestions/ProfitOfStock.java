


import java.util.*;


public class ProfitOfStock {
    public static void main(String args[]){
        System.out.println("WORKING");
        int[] nums  =  {1,2,0,4,7,9};
        int profit = 0,low =0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]>0 && nums[i+1] !=0 && nums[i] !=0){
                low = nums[i+1]-nums[i];
                System.out.println("value "+ low  + " i "+i);
                profit = profit+low;
            }
        }
        System.out.println(profit);
    }
}