

class Solution {
    public int majorityElement(int[] nums) {
        int ans =1, i=0;
        Arrays.sort(nums);
        for( i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                ans++;
            } else{
                if(ans>nums.length/2){
                    return nums[i];
                }
                ans=1;
            }
        }
        if(ans>nums.length/2) return nums[i];
        return nums[i];
      
    }
}