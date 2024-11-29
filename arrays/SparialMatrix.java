

import java.util.*;


public class SparialMatrix {
     public static void main(String args[]) {
        System.out.println("Woring");
        int[][]  matrix = {{1,2,3},{4,5,6},{7,8,9}};
        
        int top =0, left =0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        int  n=0;
        int[] ans = new int[(right+1)*(bottom+1)];
        while(top<=bottom && left<=right) {
            for(int i = left;i<=right;i++){
                ans[n]  = matrix[top][i];
                n++;
            }
            top++;
            for(int i = top;i<=bottom;i++){
                ans[n] = matrix[i][right];
                n++;
            }
            right--;
            if (top <= bottom) {
            for(int i = right;i>=left;i--){
                ans[n] = matrix[bottom][i];
                n++;
            }
            bottom--;
        }

        if (left <= right) {
            for(int i = bottom;i>=top;i--){
                ans[n] = matrix[i][left];
                n++;
            }
            left++;
        }
        }

        for(int i =0;i<ans.length;i++) {
            System.out.println(ans[i]);
        }

     }
}