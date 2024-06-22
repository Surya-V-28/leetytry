



public class findMinNoOperation {
    public static void main(String args[]) {
        System.out.println("working");
        int[]  nums = {1,2,3,4};
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
                count++;
            }
        }
        System.out.println(count);
        
    }
}