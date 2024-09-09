

import java.util.*;
public class TwoSumEasy {
    public static void main(String[] args){
        System.out.println("Working");
    }
}


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
         int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(target-nums[i]) && hash.get(target-nums[i]) != i){
                arr[0] = i;
                arr[1] = hash.get(target-nums[i]);
                break;
            }
        }
        return arr;  
    }
}