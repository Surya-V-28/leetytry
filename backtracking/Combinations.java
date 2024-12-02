
import java.util.*;

public class Combinations {

    public static void backTrack(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> currentCombinations, int k, int n, int start) {
        if (currentCombinations.size() == k) {
            ans.add(new ArrayList<>(currentCombinations));
            return;
        }

        for (int i = start; i < n; i++) {
            currentCombinations.add(i);
            backTrack(ans, currentCombinations, k, n, i + 1);
            currentCombinations.remove(currentCombinations.size() - 1);

        }
    }

    public static void main(String[] args) {
        int n = 4, k = 2;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        backTrack(ans, current, k, n, 0);
        System.err.println("the ans of the array list ");
        System.err.println(ans);

    }
}
