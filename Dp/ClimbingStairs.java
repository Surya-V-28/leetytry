


import java.util.*;



public class ClimbingStairs { 
    public static void main(String args[]) { 
        int n  = 5; 
        int[] nums  = new int[n+1];
        nums[1] =1;
        nums[2] = 2; 
        for(int i =3; i<=n;i++){
            nums[i] = nums[i-2]+ nums[i-1];
        }
        // System.out.println(nums[4]);
        for(int val:nums){
            System.out.print(val +"  ");
        }
        DifferentWaysofClimbingStaris.NormalChecker(5);
    }
}


class DifferentWaysofClimbingStaris  {
    public static void NormalChecker( int n) {

        int curr = 1, prev= 1;
        if(n==0 || n==1)
        {
            System.out.println(" the answer is 1");
        }
        for(int i=2; i<=n;i++) {
            int temp = curr;
            curr = curr  + prev;
            prev = temp;
            System.out.println();
            System.out.println(curr);
        }
    }
}