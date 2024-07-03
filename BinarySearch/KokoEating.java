

import java.util.*;

public class KokoEating {
    public static void main(String args[]){
        System.out.println("Working");
       int[] piles = {3,6,7,11};
        int h = 8;
        int low = 1, high = Arrays.stream(piles).max().getAsInt();

        while(low<=high){
            int mid = low + (high-low)/2;
            if(cal(piles,mid,h)>h){
                low = mid+1;
            }
            else { 
                high =mid-1;
            }
        }
        System.out.println(low);
    }
    public static int cal(int[] piles, int low,int h){
        int ans =0;
        for(int i=0;i<piles.length;i++){
            ans+=Math.ceil((double)piles[i]/(double) low );
        }

        return ans;
    }
}