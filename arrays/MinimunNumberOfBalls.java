
import java.util.*;

public class MinimunNumberOfBalls {

    public static void main(String args[]) {
        System.out.println("working");
        int[] nums = {9};
        int maxOperations = 2;
        int currAns = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }

        while (maxOperations > 0) {
            Collections.sort(arr);
            System.out.println("curr Ans is " + maxOperations);
            int numMax = arr.get(arr.size() - 1);
            if (numMax == 0) {
                System.out.print("answer is came");
            } else if (numMax % 2 == 0) {
                numMax = arr.get(arr.size() - 1);
                arr.remove(arr.size() - 1);
                arr.add(numMax / 2);
                arr.add(numMax / 2);
                currAns = numMax / 2;
            } else {

                numMax = arr.get(arr.size() - 1);
                arr.remove(arr.size() - 1);
                if (!arr.isEmpty()) {
                    arr.add(arr.get(arr.size() - 1));
                    arr.add(numMax - arr.get(arr.size() - 1));
                } else {

                    arr.add(3);
                    arr.add(numMax - 3);

                }
                currAns = (numMax / 2) + 1;
            }
            System.out.println("array list is  " + arr);
            maxOperations--;
        }
        System.out.println("curr Ans is " + currAns);
        System.out.println("array list is  " + arr);
    }
}
