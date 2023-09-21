



import java.util.*;


import java.lang.Math;
public class FindAllDuplicateNumbers {
    public static void main(String args[]) {
        System.out.println("Working with surya");
        int[] nums = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=0;i<nums.length;++i){
            int index = Math.abs(nums[i])-1;
            System.out.println("index value  "+ index);
            if(nums[index]<0){
                num.add(Math.abs(index+1));
                System.out.println("index value inside the loop  "+ index);

            }
            nums[index] = -nums[index];
            for(int val:nums){
                System.out.print(val+" ");
            }

            System.out.println();
            System.out.println(num);
            }
        
        for(int val:nums){
            System.out.print(val+" ");
        }
        System.out.println(num);
    }
}