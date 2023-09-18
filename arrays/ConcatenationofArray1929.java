

import java.util.*;

public  class  ConcatenationofArray1929  {
        public static void main(String args[]) {
            System.out.println("Working with surya");
            int nums[] = {1,3,2,1};
            int lengths = nums.length;
            int ans[] = new int[2*nums.length];
            for(int i=0;i<nums.length;i++) {
                ans[i] = nums[i];
                ans[lengths+i] = nums[i];
            }

      

        }
}


class DifferentWays  {
    public static void diffentbuiltin(int[] nums) {
        int output[] = new int[nums.length + nums.length];
         
        System.arraycopy(nums, 0, output, 0, nums.length);
        System.arraycopy(nums, 0, output, nums.length, nums.length);
        
        for (int element: output) {
            System.out.println(element);
        }
    }
}