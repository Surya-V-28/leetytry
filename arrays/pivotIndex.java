


public class pivotIndex {
    public static void main(String[] args) {
        System.out.println("Working");
        int[] nums = {1,7,3,6,5,6};

        int presum = 0, suffsum=0,j=0;

        for(int i=1;i<nums.length;i++){
            suffsum +=nums[i];
        }
        if(presum==suffsum) System.out.println("there is no data");
 
        while(j<nums.length-1){
            presum +=nums[j];
            j++;
            suffsum  -= nums[j];
            if(presum==suffsum) {System.out.println("yeah");}
        }

    }
}