

import java.util.*;


public class FindDigitWin {
    public static void main(String[] args) {
        int[]  nums = {1,2,3,4,5,14};
        int sin=0;
        int doub = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9){
                sin = sin + nums[i];
            } else {
                doub = doub+ nums[i];
            }
        }
        if(doub !=sin){System.out.println("True");}
        else {
            System.out.println("false");
        }

    }
}