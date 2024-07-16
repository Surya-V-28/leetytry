

import java.util.ArrayList;
import java.util.List;

public class BacktrackingTemplate1 {

    // Function to generate all permutations of a given string
    public static List<String> generatePermutations(String str) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), str, new boolean[str.length()]);
        return result;
    }

    private static void backtrack(List<String> result, StringBuilder temp, String str, boolean[] used) {
        if (temp.length() == str.length()) {
            result.add(temp.toString());
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (used[i]) continue;
                temp.append(str.charAt(i));
                used[i] = true;
                backtrack(result, temp, str, used);
                used[i] = false;
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> permutations = generatePermutations(input);
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
}
