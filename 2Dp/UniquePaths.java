
public class UniquePaths {
    public static void main(String args[]){
        System.out.println("Working");
        int m = 3, n= 7;
        int[][] dp=  new int[m][n];
        System.out.println(helper(0,0,n,m,dp));

    }

    public static int helper(int row, int col, int n, int m,int[][] dp) {
        if(row>=m || col>=n || row<0 || col<0) return 0;

        if(dp[row][col]>0) return dp[row][col];

        if(row==m-1 && col==n-1) return 1;

        int down = helper(row,col+1,n,m,dp);
        int rightt = helper(row+1,col,n,m,dp);

        dp[row][col]=down+rightt;

        return dp[row][col];
    }
}