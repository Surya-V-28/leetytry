


import java.util.*;



public class DailyTemperature739 {
    public static void main(String args[]){
        int[] nums = {89,62,70,58,47,47,46,76,100,70};
        int[] nums2 = new int[nums.length];
        Stack<Integer> hash = new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(!hash.isEmpty()&& nums[i] > nums[hash.peek()]){
                int stvalue = hash.pop();
                nums2[stvalue] =  i - stvalue;
            }
            hash.push(i);
            System.out.println(hash);
        }
        arrayhelper.arrayPrinter(nums2);
        arrayhelper.arrayPrinter(nums);

    }
}



class MyDifferentWays  {
    public static void BruteForce(int[] nums ) {
        int[] nums2 = new int[5];
        nums2[nums.length-1] = 0;
        int index = 1,i; 
        index=1;
        for(i =0; i< nums.length;i++){
            for(int j=0+i;j<nums.length-1;j++){
                if(nums[i]<nums[j+1]){
                    System.out.print(" " + index);
                    nums2[i]=index;
                    index=1;
                    break;
                }
                index++;
            }
        }
    }

}