

import java.uitl.*;

public class SumofMaxSubArray {
    public static void main(String[] args){
        int count =0;
        int sum =0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,1);
        for(int i =0;i<nums.length;i++ ){
            sum+=nums[i];
            int remove=sum-k;
            count+=hash.getOrDefault(remove,0);//0 as if remove not found let it be 0
            hash.put(sum,hash.getOrDefault(sum,0)+1);
        }
        System.out.println(count);

    }
}


/// not good wont work for all the cases it might cause the error

class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int maxLen =0;
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            sum = sum + nums[i];

            if(sum==k) {
                maxLen = Math.max(maxLen,i+1);
            }

            if(hash.containsKey(sum-k)){
                maxLen = Math.max(maxLen,i- hash.get(sum-k));
            }

            if(!hash.containsKey(sum)){
                hash.put(sum,i);
            }
        }

        return maxLen;
        
    }
}