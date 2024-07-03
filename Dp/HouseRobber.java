


import java.util.*;

public class HouseRobber {
    public static void main(String args[]){
        System.out.println("Wokring");
        int[] nums = {1,2,3,1};
        int oValue=0, eValue=0;

        for(int i=0;i<nums.length;i=i+2){
            eValue = eValue  + nums[i];
        }
        for(int i=1;i<nums.length;i=i+2){
            oValue = oValue  + nums[i];
        }
        System.out.println(oValue);
        System.out.println(eValue);

    }
}