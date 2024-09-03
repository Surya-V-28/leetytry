

public class MaxConsecutiveOnes2 {
    public static void main(String[] args){
        System.out.println("Working");
        int[] nums ={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int start=0,right=0;
        int result=0;
        int k =3;
        for(right=0;right<nums.length;right++){
            if(nums[right]==0){
               k--;  
            } 
            while(k<0) {
                if(nums[start]==0){
                    k++;
                }
                start++;
            }
            result = Math.max(result,right-start + 1);

        }
        System.out.println(result);

    }
}