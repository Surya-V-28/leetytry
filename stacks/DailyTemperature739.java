


import java.util.*;



public class DailyTemperature739 {
    public static void main(String args[]){
        System.out.print("Working");
        int[] nums = {99,919,99,99,99,99,99,909,919,99,99,99,99,99,99,99,929,99,99,939,99,99,949};
        Stack<Integer> hashStack = new Stack<>();
        int[] result  = new int[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){

            while(!hashStack.isEmpty()&&nums[i] >= nums[hashStack.peek()]){
                hashStack.pop();
            }

            while(!hashStack.isEmpty()){result[i] = hashStack.peek()-i;}

            hashStack.push(i);
        }

        arrayhelper.arrayPrinter(result);
        
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