
import java.util.*;

public class SetMatrixZero {

    public static void bruteForce() {
        int[][] nums = {
            {1, 1, 2, 0},
            {3, 0, 5, 2},
            {1, 3, 1, 5}
        };
        HashSet<Integer> rowWise = new HashSet<>();
        HashSet<Integer> colWise = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == 0) {
                    rowWise.add(i);

                    colWise.add(j);
                }
            }
        }
        while (!rowWise.isEmpty()) {
            int temp = rowWise.iterator().next(); // Get an element
            rowWise.remove(temp);
            for (int rowcount = 0; rowcount < nums[0].length; rowcount++) {
                nums[temp][rowcount] = 0;
            }

        }

        while (!colWise.isEmpty()) {
            int temp = colWise.iterator().next(); // Get an element
            colWise.remove(temp);
            for (int colCount = 0; colCount < nums.length; colCount++) {
                nums[colCount][temp] = 0;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + ", ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int[][] nums = {
            {1, 1, 2, 0},
            {3, 0, 5, 2},
            {1, 3, 1, 5}
        };

        boolean[] arr = new boolean[nums.length * nums[1].length + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == 0 && !arr[i * nums[0].length + j]) {
                    arr[i * nums[0].length + j] = true;
                    for (int rowcount = 0; rowcount < nums[0].length; rowcount++) {
                        nums[i][rowcount] = 0;
                        arr[i * nums[0].length + rowcount] = true;
                    }
                    for (int colCount = 0; colCount < nums.length; colCount++) {
                        nums[colCount][j] = 0;
                        arr[i * nums[0].length + colCount] = true;
                    }

                }
            }
        }
        // while (!rowWise.isEmpty()) {
        //     int temp = rowWise.iterator().next(); // Get an element
        //     rowWise.remove(temp);
        //     for (int rowcount = 0; rowcount < nums[0].length; rowcount++) {
        //         nums[temp][rowcount] = 0;
        //     }

        // }
        // while (!colWise.isEmpty()) {
        //     int temp = colWise.iterator().next(); // Get an element
        //     colWise.remove(temp);
        //     for (int colCount = 0; colCount < nums.length; colCount++) {
        //         nums[colCount][temp] = 0;
        //     }
        // }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + ", ");
            }
            System.out.println();
        }

    }

}
