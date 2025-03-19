
import java.util.HashSet;

public class GenerateAllBinaryString {

    public static void bactrack(int start, int k, StringBuilder str, HashSet<String> set) {
        if (start == k - 1) {
            set.add(str.toString());
            return;
        }

        // Append '0' and recurse
        str.append("0");
        bactrack(start + 1, k, str, set);
        str.deleteCharAt(str.length() - 1); // Backtrack

        // Append '1' only if the last character isn't '1'
        if (str.length() == 0 || str.charAt(str.length() - 1) != '1') {
            str.append("1");
            bactrack(start + 1, k, str, set);
            str.deleteCharAt(str.length() - 1); // Backtrack
        }

    }

    public static void main(String[] args) {
        System.out.print("working on the code");

        int k = 3;
        HashSet<String> set = new HashSet<>();
        StringBuilder str = new StringBuilder();
        str.append("0");
        bactrack(0, k, str, set);
        str.deleteCharAt(str.length() - 1);
        str.append("1");
        bactrack(0, k, str, set);
        System.out.println(set);

    }
}
