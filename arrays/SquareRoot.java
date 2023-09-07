

import java.util.*;


public  class SquareRoot {
    public static void main(String args[]){
        System.out.println("Working ");
        long num = 600; 
        long ans = 1;
        for(int i=0; i<num ;i++){
            if(i*i>num){
                break;
            }
            else {
                ans = i;
                System.out.println(i*i);
            }
        }
        System.out.println(ans);
    }
}


class SquareRootDifferentWays { 
    public static void bInearySearch(long num,int targ){
        long low =0, high = num;
        long ans =0;
        while(low<=high){
            long mid = low + (high-low)/2;
            if(mid*mid==targ){
                ans = mid;
                break;
            }
            else if (mid*mid < targ){
                ans = mid;
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return (int)ans;
    }
}
