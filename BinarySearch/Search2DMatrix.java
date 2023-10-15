



import java.util.*;


public class Search2DMatrix {
    public static void main(String args[]) {
        int[][] matricx = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int m = matricx.length;
        int n = matricx[0].length;
        int right = m*n-1,left=0;
        int target = 60;
        


        while(left<=right) {
            int mid = (left + right)/2;
            if(matricx[mid/n][mid%n] < target) {
                left = mid+1;
            } else if(matricx[mid/n][mid%n] ==target) {
                System.out.println("Elements Found");
                break;
            }
            else {
                right = mid-1;
            }
        }
    }        
}
