
import java.util.Arrays;

public class MinimunArrows {

    public static void main(String args[]) {
        System.out.println("working on the answers");
        int[][] points = {
            {10, 16},
            {2, 8},
            {1, 6},
            {7, 12}
        };
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        // Print the points
        int[] prev = points[0];
        int res = points.length;
        for (int i = 1; i < points.length; i++) {
            int[] curr = points[i];
            if (curr[0] <= prev[1]) {
                res -= 1;
                prev[1] = Math.min(curr[1], prev[1]);
            } else {
                prev = curr; // updating the prev if there is no match in the intervals
            }
        }
        System.out.println("the result is " + res);
    }
}
