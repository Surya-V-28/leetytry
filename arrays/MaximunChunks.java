
import java.util.ArrayList;

public class MaximunChunks {

    public static void main(String args[]) {
        System.out.println("wokring the answers");
        int[] arr = {1, 2, 4, 3, 8, 9, 0, 11, 15};
        int counter = 1;
        int previousIncrease = -1;
        ArrayList<Integer> arrs = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                counter++;
                arrs.add(arr[i]);
            } else if (arr[i] > arr[i + 1]) {

                if (previousIncrease != i && previousIncrease != i - 1) {
                    counter++;
                    arrs.add(-1 * arr[i]);
                }
                previousIncrease = i;
                i++;
            }

        }
        System.out.println(counter);
        System.out.print(arrs);

    }
}
