

import java.util.*;


public class BuyandSellStockPrice {
    public static void main(String arg[]){
        System.out.println("Working ith surya ");
        int[] num = {1,2,4,2,5,7,2,4,9,0,9};
        DifferentWaystoBuyandSell.TwoPointers(num);

        

    }
}



class DifferentWaystoBuyandSell { 
    public static void TwoPointers(int[] nums) {
        int left = 0, right =1; 
        int max = 0; 
        System.out.println("entering the loops  ");
        // sample array as {1,2,4,2,5,7,2,4,9,0,9}
        while(left<nums.length && right<nums.length){
            if(nums[left] < nums[right]){
                max = max<nums[right]- nums[left]? nums[right]- nums[left]:max;
                right++;
            } 
            else {
                left = right;
            }
            right++;
        }
        System.out.println(max);
    }


    public static void BruteForce(int[] num) {

        int sum= 0;
        int prev=0;
        boolean  buy = true;
        for(int i=0;i<num.length-1;i++){
            if(num[i] <num[i+1]&& buy==true){
                System.out.println("Brought the value  " + num[i]);
                buy = false;
                prev = num[i];
            }
            else if(buy==false &&prev<num[i]){ 
                System.out.println("sell the stock   " + num[i]);
                buy= true;
                sum = sum + num[i]-prev;
            }

        }
        System.out.println(sum);
    }
}