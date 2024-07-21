

import java.util.*;

public class NumberofBittoEqual {
    public static void main(String args[]) {
        System.out.println("Working");
        int n= 14, k = 13;
        int ans=0;
        int maxBits = Math.max(Integer.toBinaryString(n).length(), Integer.toBinaryString(k).length());
        for(int i = maxBits-1;i>=0;i--){
            int bitOne = (n>>i)&1;
            int bitTwo = (k>>i)&1;
            if(bitOne!= bitTwo) ans++;

        }
        System.out.println("Working" + ans);


    }
}