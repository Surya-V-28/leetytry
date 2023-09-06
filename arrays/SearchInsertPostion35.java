

import java.util.*;

public class SearchInsertPostion35 {
    public static void main(String args[]){
        System.out.println("Working");
        int[] nums = {1,3,5,7}; 
        int target  = 5;
        int index = 0,i,ins=0,flag=0;

        for( i=0;i<nums.length;i++){
            if(target==nums[i]){
                index =i;
                flag =0;
                break;

            }
            if(target >=nums[i]){
                ins =i;
                flag=1;
            }
    
        }
        if(flag==1){
            System.out.println(ins+1);
        }else {
            System.out.println(index);
        }
        
       
    }
}