

public class RotateArray {
    public static void swap(int left,int right, int[] nums){
        while(left<right) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        System.out.println("Working");
        int nums[] = {1,2,3,4,5,6,7};
        int k=3;
        k = k%nums.length;
        int j=0;// swap it form the start till end;
        swap(0,nums.length-1,nums);
        swap(0,k-1,nums);
        swap(k,nums.length-1,nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

    }
}