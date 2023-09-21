



import java.util.*;



import java.lang.*;
import java.util.*;


public class SingleNumberArray { 
    public static void main(String args[]){
        System.out.println("Workng with surya ");
        int left=0, right =1;
        int[] nums  = {2,2,1};
         // using the bit wisse operators 
         int sum=0;
         for(int i=0;i<nums.length;i++){
            sum = sum^nums[i];
         }
         System.out.println(sum);
    }
}


