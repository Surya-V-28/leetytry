

import java.util.*;


public class LongestSubSequence {
    public static void main(String args[]){

        System.out.println("Working");
       String text1 = "abcde", text2 = "ace";
       int[][] dp = new int[text1.length()][text2.length()];

       // Fill dp array with -1
       for (int i = 0; i < dp.length; i++) {
           Arrays.fill(dp[i], -1);
       }
       System.out.println(recuirse(text1.length()-1, text2.length()-1, text1, text2,  dp));
        
    }

    public static int recuirse(int index1, int index2, String txt1, String txt2, int[][] dp){

        if(index1<0 || index2<0) return 0;
        if (dp[index1][index2] != -1) return dp[index1][index2];
        // if there is a match only we recurise
        if(txt1.charAt(index1)==txt2.charAt(index2)) {
           return  dp[index1][index2]  = 1+recuirse(index1-1,index2-1,txt1,txt2,dp);
        }
        // if there is no match means we need to go either way as in any one index -1 and maximun of it
    
        
        return dp[index1][index2] = Math.max(recuirse(index1-1,index2,txt1,txt2,dp),recuirse(index1,index2-1,txt1,txt2,dp));
    }
}


class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int maxLen = Math.max(text1.length(),text2.length());
        int ans = 0;
        String chck = text1.length()<text2.length()?text2:text1;
        String chck2 = text1.length()<text2.length()?text1:text2;
        for(int j=0;j<chck2.length();j++){
        for(int i=0;i<maxLen;i++){
            if(chck.charAt(i)==chck2.charAt(j)){
                ans++;
            }
        }
        }
        System.out.println(ans);
        return ans; 
    }
}