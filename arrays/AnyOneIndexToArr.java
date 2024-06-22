

public class AnyOneIndexToArr {
    public static void main(String args[]) {
        System.out.println("Working");

        int[] nums = {0,1,1,0,1};
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                count++;
                  for(int j=0;j<nums.length;j++){
                     nums[j] = (nums[j]==0)? 1:0;
                  }
               }
            }
        
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println(count);
    }
}