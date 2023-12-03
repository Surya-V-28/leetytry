


import java.util.*;


public class UniquieNumberOfOcurrence {
    public static void main(String args[]){
        System.out.println("Wokring");
        int[]  nums = {1,2,2,1,1,3};

        HashMap<Integer, Integer> hash = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            hash.put(nums[i], hash.getOrDefault(nums[i],0)+1);
        }
       
        for(int i:hash.values()){
            set.add(i);
        }
        if(set.size()==hash.size()){
            System.out.println("Correct");
        }
        else {
            System.out.println("Wrong");
        }
    }
}