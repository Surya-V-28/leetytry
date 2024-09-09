
class Solution {
    public void sortColors(int[] nums) {
        int zeros =0;
        int ones =0;
        

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeros ++;
            }
            else if(nums[i]==1){
                ones++;
            }
        }
        int j=0;
        while(j <zeros){
            nums[j] = 0;
            j++;
        }
        System.out.println(ones + " bale " + j);
        while(j <ones + zeros){
            nums[j] = 1;
            j++;
        }
        j = zeros + ones;
        while(j < nums.length){
            nums[j] = 2;
            j++;
        }
        
        
    }
}