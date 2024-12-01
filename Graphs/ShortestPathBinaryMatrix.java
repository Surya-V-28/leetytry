
import java.util.*;

public class ShortestPathBinaryMatrix {

    public static int bfsCellWise(int[][] graph) {

        int number = graph.length;
        int c = graph.length;
        int r = graph[0].length;
        if (number == 1) {
            return 1;
        }
        int[][] clone = copyMatrix(graph);
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 1});

        // predefined directions of the cells
        int[][] dir = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1}, {0, 1},
            {1, -1}, {1, 0}, {1, 1}

        };

        while (!q.isEmpty()) {
            int[] currentArr = q.poll();
            int Row = currentArr[0], Col = currentArr[1], Path = currentArr[2];

            if (Row == r - 1 && Col == c - 1) {
                return Path;
            }

            for (int[] eleDir : dir) {
                int cRow = Row + eleDir[0];
                int cCol = Col + eleDir[1];

                if (cRow >= 0 && cCol >= 0 && cCol < c && cRow < r && graph[cRow][cCol] == 0 && clone[cRow][cCol] != 1) {
                    q.add(new int[]{cRow, cCol, Path + 1});
                    clone[cRow][cCol] = 1;
                }
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        System.err.println("Working");

        int[][] grid = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        System.out.println(bfsCellWise(grid));
    }

    public static int[][] copyMatrix(int[][] graph) {
        int[][] clone = new int[graph.length][];
        for (int i = 0; i < graph.length; i++) {
            clone[i] = graph[i].clone();
        }
        return clone;

    }
}
