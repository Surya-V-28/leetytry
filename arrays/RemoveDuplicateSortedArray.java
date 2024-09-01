

public class RemoveDuplicateSortedArray {
    public static void main(String[] args){
        System.out.println("working");
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        int counterLastIndex=0;
        nums[counterLastIndex] = nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] !=nums[i+1]){
                counterLastIndex++;
                nums[counterLastIndex] = nums[i+1];
            }
        }
        for(int i=0;i<=counterLastIndex;i++){
            System.out.println( nums[i]+ ", ");
        }

    }
}