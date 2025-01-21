
import java.util.ArrayList;

public class MergeIntervals {

    public static void main(String[] args) {
        System.out.println("Working on the answers");

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        boolean[] visted = new boolean[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            int j = i + 1;

            if (j < intervals.length && intervals[i][1] >= intervals[j][0]) {
                ArrayList<Integer> ars = new ArrayList<>();
                ars.add(intervals[i][0]);
                ars.add(Math.max(intervals[i][1], intervals[j][1]));
                arr.add(ars);
                visted[i] = true;
                visted[j] = true;
            }

            if (!visted[i]) {
                ArrayList<Integer> ars = new ArrayList<>();
                ars.add(intervals[i][0]);
                ars.add(intervals[i][1]);
                arr.add(ars);
            }

        }

        System.out.println(arr);

    }
}
