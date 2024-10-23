

public class RearrangeArrayElementsBySign {

    public static void GoodMethod(int[] arrs) {
        int pos =0;
        int neg =1; 
        int[] nums = new int[arrs.length];

        for(int i=0;i<arrs.length;i++){
            if(arrs[i]>0){
                nums[pos] = arrs[i];
                pos= pos+2;
            } else {
                nums[neg] = arrs[i];
                neg= neg+2;
            }
        }
    }

    public static void main(String args[]){
        int[] posArr = new int[nums.length+1/2];
        int[] negArr = new int[nums.length+1/2];
        int pos=0, neg =0;

        for(int i=0;i<nums.length;i++) {
            if(nums[i]>0){
                posArr[pos++]=nums[i];
            } else {
                negArr[neg++]=nums[i];
            }
        }
        int counter=0;
        int i=0;
        while(i<nums.length/2){
            nums[counter++] = posArr[i];
            nums[counter++] =negArr[i];
            i++;
        }

        
    }
    
}
