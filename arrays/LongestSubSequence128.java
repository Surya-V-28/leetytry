


import java.util.*;

public class  LongestSubSequence128 {
    public static void main(String args[]) {
        System.out.println("Working");
        int [] nums  = {0,3,7,2,5,8,4,6,0,1,100,101,100,103,105,106,108,107,104,1000,1001,1002};
        LongestSubSequence128Ways.BetterUsingSort(nums);
       
    }
}



class LongestSubSequence128Ways  {
    static void Optimal(int[] nums) {
        int maxLength = Math.min(nums.length,1);
        int value;
        int count=0;

        Set<Integer> seen = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            seen.add(nums[i]);
        }
        System.out.println(seen);
        for(int j=0;j<nums.length;j++){
            if(!seen.contains(nums[j]-1)){
                value = nums[j];
                while(seen.contains(value)){
                  count++;
                  value++;
                }
                maxLength = Math.max(maxLength,count);
                count =0;
            }
        }
        System.out.println("Vount s got "+maxLength );

    }

    static void BetterUsingSort(int[] nums) {
        // here we need to use the three basic code case for the working 
        int LargestSmall = Integer.MIN_VALUE;
        int count = 1;
        int MaxLength = 1;
        Arrays.sort(nums);
       
        LargestSmall = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==LargestSmall){
                count++;
                LargestSmall = nums[i];

            }else if(nums[i]-1!=LargestSmall){
               
                count=1;
                LargestSmall = nums[i];
            }
            MaxLength =Math.max(MaxLength,count);
        }
        System.out.println(MaxLength);
    }

    static void BruteForce(int[] nums){

    }
}