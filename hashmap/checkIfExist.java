
import java.util.HashMap;

public class checkIfExist {

    public static void main(String[] args) {
        System.err.println("Working");
        int[] arr = {-2, 0, 10, -19, 4, 6, -8};
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hash.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(2 * arr[i]) && hash.get(2 * arr[i]) != i) {
                System.err.println("Found the Double of the elements " + (i + 1) + " th index");
            }
        }

    }
}
