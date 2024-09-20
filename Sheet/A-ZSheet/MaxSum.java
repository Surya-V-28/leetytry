

public class MaxSum {
    public static void main(String args[]){
        System.out.println("Working properly");
        int[] nums = { -2,1,-3,4,-1,2,1,-5,4};
        int ans =Integer.MIN_VALUE, preans = 0;
        int left =0,right=0;


       while(right< nums.length){
        preans = preans + nums[right];      /// -2 + 4
        if(preans>ans){   
            System.out.println(" cpomparing the value " + preans +" > " + ans + " at the right " + right);           /// 2 > -                              // 2
            ans = Math.max(ans,preans);    
                                      // right =
        } 
        if (preans < 0) {
            preans = 0;
            System.out.println("Resetting preans to 0 at index " + right);
        }
        right++; 
           
       }

       System.out.println(ans);

    }
}