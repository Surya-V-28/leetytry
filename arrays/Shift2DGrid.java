
public class Shift2DGrid {

    public static void main(String[] args) {
        int[][] grid = {{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}};
        int k = 40;
        int[] arrs = new int[grid.length * grid[0].length];
        int counter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                arrs[counter++] = grid[i][j];
            }
        }
        int rows = grid.length, cols = grid[0].length;
        int totalElements = rows * cols;
        k = k % totalElements;
        int start = totalElements - k;
        // Circularly update the grid
        int icounter = 0, jcounter = 0;
        for (int i = start; i < start + totalElements; i++) {
            grid[icounter][jcounter++] = arrs[i % totalElements];
            if (jcounter == cols) { // Move to next row when a row is filled
                jcounter = 0;
                icounter++;
            }
        }

    }

}
