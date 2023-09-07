

import java.util.*;


public class MatrixTravsel {
    public static void main(String args[]) {
        System.out.println("Wokring");
        int sum=0;
        int[][] nums  =  {
            {1,1,1},
            {1,1,1},
            {1,1,1},
        };
        for(int i=0;i<nums.length;i++){
            sum =sum+nums[i][i];
            System.out.println(sum);
        }

        int start = 0 , end =nums.length-1;
        while(end>=0){
            sum=sum+nums[start][end];
            System.out.println(sum);
            start++;
            end--;
        }
        if(nums.length%2==1){
            System.out.println(nums.length+" nummber");
        sum = sum-nums[(nums.length-1)/2][(nums.length-1)/2];
        }

        System.out.println(sum);
    }
}