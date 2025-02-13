
import java.util.ArrayList;
import java.util.Collections;

public class MatrixDiagonal {

    public static void main(String[] args) {
        System.out.println("Workoing on the answers");
        int[][] grid = {
            {2, 3, -3, -4},
            {3, 2, 3, -2},
            {3, 2, 3, 3},
            {-3, 5, -2, 1}
        };
        int counter = 0;
        while (counter < grid.length) {
            int start = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> decArr = new ArrayList<>();
            for (int i = 0; i < grid.length - counter; i++) {
                arr.add(grid[i + counter][start]);
                if (counter != 0) {
                    decArr.add(grid[i][i + counter]);
                }
                start++;
            }
            System.out.println("printing the arrays" + arr);
            System.out.println("printing the arrays" + decArr);
            Collections.sort(arr, Collections.reverseOrder());
            Collections.sort(decArr);
            // for the lower loops
            start = 0;
            for (int i = 0; i < grid.length - counter; i++) {
                grid[i + counter][start] = arr.get(start);
                if (counter != 0) {
                    grid[start][i + counter] = decArr.get(start);
                }
                start++;
            }

            // for the upper loops 
            counter++;
            System.out.println("Counter values" + counter);
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

}
