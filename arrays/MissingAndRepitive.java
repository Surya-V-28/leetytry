


public class MissingAndRepitive {
    public static void main(String args[]){
        System.out.println("Working");
        int[] arr = {1,3,3};
        // first finding the two arrays values here 
        // long sum of arr - sum of n natural
        long n = arr.length;
        long sn =(n * (n+1))/2;
        //  long sum of square  of arr - sum of square of n natural
        long s2n = (n *(n+1)* (2*n +1))/6;

        // init the variables for the Sa and S2a where sa is sum of arr
        long sa=0, s2a =0;

        for(int i=0;i<arr.length;i++){
            sa += arr[i];
            s2a += (long)arr[i]* (long) arr[i];
        }
        
        long val1 = sa-sn;
        long val2 = s2a-s2n;
        val2 = val2/val1;

        long x = (val1+val2) /2;
        long y = x-val1;

        int[] ans = new int[2];
        ans[0] = (int) x;
        ans[1] =(int)y;

        // return ans;


        
    }
}