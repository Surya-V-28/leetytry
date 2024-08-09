import java.util.*;

public class SouurendedRegoins {
    public static void main(String[] args) {
        char[][] board = {
            {'X', 'X', 'X', 'O'},
            {'X', 'O', 'O', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'O', 'X', 'O'}
        };

        int m = board.length;
        int n = board[0].length;
        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            if (ans[0][i] == 0 && board[0][i] == 'O') {
                dfs(ans, 0, i, m, n, board);
            }
            if (ans[m - 1][i] == 0 && board[m - 1][i] == 'O') {
                dfs(ans, m - 1, i, m, n, board);
            }
        }

        for (int i = 0; i < n; i++) {
            if (ans[i][0] == 0 && board[i][0] == 'O') {
                dfs(ans, i, 0, m, n, board);
            }
            if (ans[i][n - 1] == 0 && board[i][n - 1] == 'O') {
                dfs(ans, i, n - 1, m, n, board);
            }
        }

        for (int i = 0; i < board.length; i++) { // Outer loop for rows
            for (int j = 0; j < board[i].length; j++) { // Inner loop for columns
                if (ans[i][j] == 0 && board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // Newline after each row
        }
    }

    public static void dfs(int[][] ans, int row, int col, int m, int n, char[][] original) {
        ans[row][col] = 1;

        int[] nrows = {-1, 0, 1, 0};
        int[] ncols = {0, 1, 0, -1};
        for (int i = 0; i < 4; i++) {
            int newRow = row + nrows[i];
            int newCol = col + ncols[i];
            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && original[newRow][newCol] == 'O' && ans[newRow][newCol] == 0) {
                dfs(ans, newRow, newCol, m, n, original);
            }
        }
    }
}
