
import java.util.LinkedList;
import java.util.Queue;

public class NearExist {

    public static int bfs(int[] enternece, int[][] cloneMatrix, int result, String[][] maze, int n, int m) {
        Queue<int[]> q = new LinkedList<>();
        q.add(enternece);
        boolean sets = false;
        cloneMatrix[enternece[0]][enternece[1]] = 1;
        // create all the possible direcctions
        int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

        while (!q.isEmpty()) {
            int[] currentVetrices = q.poll();
            int crow = currentVetrices[0], ccol = currentVetrices[1];
            for (int[] dir : directions) {
                int nrow = crow + dir[0];
                int ncol = ccol + dir[1];
                if (nrow >= 0 && ncol >= 0 && nrow < n && ncol < m && maze[nrow][ncol].equals(".") && cloneMatrix[nrow][ncol] == 0) {
                    q.add(new int[]{nrow, ncol});
                    cloneMatrix[nrow][ncol] = 1;
                    result++;

                    if (nrow == n - 1 || nrow == m - 1) {
                        System.out.println("Exited bcoz the out sided reached with  " + nrow + "i " + ncol + " j is that");
                        sets = true;
                    }
                }
            }
            if (sets) {
                break;
            }
        }
        return result;
    }

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
