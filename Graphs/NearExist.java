
import java.util.LinkedList;
import java.util.Queue;

public class NearExist {

    public static int bfs(int[] enternece, int[][] cloneMatrix, int result, String[][] maze, int n, int m) {
        Queue<int[]> q = new LinkedList<>();
        q.add(enternece);
        boolean sets = false;
        cloneMatrix[enternece[0]][enternece[1]] = 1;

        int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

        while (!q.isEmpty()) {
            int[] currentVetrices = q.poll();
            int crow = currentVetrices[0], ccol = currentVetrices[1];
            for (int[] dir : directions) {
                int nrow = crow + dir[0];
                int ncol = ccol + dir[1];
                if (nrow >= 0 && ncol >= 0 && nrow < n && ncol < m && ".".equals(maze[nrow][ncol]) && cloneMatrix[nrow][ncol] == 0) {
                    q.add(new int[]{nrow, ncol});
                    cloneMatrix[nrow][ncol] = 1;
                    result++;
                    if (nrow != enternece[0] || ncol != enternece[1]) {
                        if (nrow == 0 || nrow == n - 1 || ncol == 0 || ncol == m - 1) {
                            return result;
                        }
                    }
                }
            }
        }
        return result;
    }

    // public static int bfs(int[] enternece, int[][] cloneMatrix, int result, String[][] maze, int n, int m) {
    //     Queue<int[]> q = new LinkedList<>();
    //     q.add(enternece);
    //     boolean sets = false;
    //     cloneMatrix[enternece[0]][enternece[1]] = 1;
    //     // create all the possible direcctions
    //     int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    //     while (!q.isEmpty()) {
    //         int[] currentVetrices = q.poll();
    //         int crow = currentVetrices[0], ccol = currentVetrices[1];
    //         for (int[] dir : directions) {
    //             int nrow = crow + dir[0];
    //             int ncol = ccol + dir[1];
    //             if (nrow >= 0 && ncol >= 0 && nrow < n && ncol < m && maze[nrow][ncol].equals(".") && cloneMatrix[nrow][ncol] == 0) {
    //                 q.add(new int[]{nrow, ncol});
    //                 cloneMatrix[nrow][ncol] = 1;
    //                 result++;
    //                 if (nrow != enternece[0] && ncol != enternece[1]) {
    //                     if (nrow == 0 || nrow == m - 1) {
    //                         return result;
    //                     }
    //                     if (ncol == 0 || ncol == m - 1) {
    //                         return result;
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     return result;
    // }
    public static void main(String[] args) {
        System.out.println("Working");
        String[][] maze = {{"+", "+", "+"}, {".", ".", "."}, {"+", "+", "+"}};
        int[] enterance = {1, 0};

        int[][] cloneMatrix = new int[maze.length][maze[0].length];

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (maze[i][j].equals("+")) {
                    cloneMatrix[i][j] = 1;
                }
            }
        }
        int result = 0;
        int n = maze.length;
        int m = maze[0].length;
        //calling the bfs
        System.out.println(bfs(enterance, cloneMatrix, result, maze, n, m));
    }
}

class Solution {

    public int bfs(int[] entrance, int[][] cloneMatrix, char[][] maze, int n, int m) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{entrance[0], entrance[1], 0});  // Include step count in queue
        cloneMatrix[entrance[0]][entrance[1]] = 1;      // Mark entrance as visited

        int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};  // Right, Down, Up, Left

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int crow = current[0], ccol = current[1], steps = current[2];

            for (int[] dir : directions) {
                int nrow = crow + dir[0];
                int ncol = ccol + dir[1];

                if (nrow >= 0 && ncol >= 0 && nrow < n && ncol < m && maze[nrow][ncol] == '.' && cloneMatrix[nrow][ncol] == 0) {
                    // Check if it is a boundary cell and not the entrance
                    if ((nrow == 0 || nrow == n - 1 || ncol == 0 || ncol == m - 1)) {
                        return steps + 1;
                    }

                    q.add(new int[]{nrow, ncol, steps + 1});
                    cloneMatrix[nrow][ncol] = 1;  // Mark as visited
                }
            }
        }
        return -1;  // No path to exit
    }

    public int nearestExit(char[][] maze, int[] entrance) {

        int[][] cloneMatrix = new int[maze.length][maze[0].length];

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (maze[i][j] == '+') {
                    cloneMatrix[i][j] = 1;
                }
            }
        }
        int result = 0;
        int n = maze.length;
        int m = maze[0].length;
        //calling the bfs
        return bfs(entrance, cloneMatrix, maze, n, m);

    }
}
