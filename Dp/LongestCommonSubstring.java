

import java.util.*;

public class LongestCommonSubstring {
    public static void main(String args[]) {
        System.out.println("Working");
        String str1 = "ABCDGH", str2 = "ACDGHR";
        char[] strr1 = str1.toCharArray();
        char[] strr2 = str2.toCharArray();
        int max =0;
        int[][] dp = new int[strr1.length+1][strr2.length+1];
        for(int i=1;i<=strr1.length;i++) {
            for(int j=1;j<=strr2.length;j++) {  
                if(strr1[i-1]==strr2[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1; 
                    max = Math.max(dp[i][j],max);
                }
            }
        }
        System.out.println(max);
    }
}