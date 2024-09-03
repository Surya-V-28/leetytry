public class MaxConsecutiveOnes {
    public static void main(String[] args){
        System.out.println("working");
        int[] nums ={1,1,0,1,1,1,0,1,1};
        int start=0,end=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                end++;
            } else {
                result = Math.max(result,end-start);
                while(nums[start]!=0) {
                    start++;
                }
                end= start;
            }
        }
        result = Math.max(result, end- start);
        System.out.println(result);
    }
}