

public class AnyThreeOperations {
    public static void  main(String args[]){
        System.out.println("wORKING");

        int[] nums = {0,1,1,1,0,0};
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
               if(i+2<nums.length){
                count++;
                nums[i] = (nums[i] == 0) ? 1 : 0;
                nums[i+1] = (nums[i+1] == 0) ? 1 : 0;
                nums[i+2] = (nums[i+2] == 0) ? 1 : 0;
               }
            }
        }
        for(int i=0;i<nums.length;i++){

            System.out.println(nums[i]);
            if(nums[i]!=1){
                System.out.println("Not Working");
            }
        }
        System.out.println(count);
    }
}