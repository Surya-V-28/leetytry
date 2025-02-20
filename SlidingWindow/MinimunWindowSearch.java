
import java.util.*;

public class MinimunWindowSearch {

    public static void main(String[] args) {
        System.out.println("working ont  the code");
        String s = "ADOBECODEBANC", t = "ABC";
        HashMap<Character, Integer> hashT = new HashMap<>();
        HashMap<Character, Integer> crr = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            hashT.put(t.charAt(i), hashT.getOrDefault(t.charAt(i), 0) + 1);
        }

        int left = 0;
        int have = 0;
        int need = t.length() - 1;
        int Max_len = Integer.MAX_VALUE;
        int[] res = {-1, -1};

        for (int right = 0; right < s.length(); right++) {
            crr.put(s.charAt(right), crr.getOrDefault(s.charAt(right), 0) + 1);

            if (hashT.containsKey(s.charAt(right)) && hashT.get(s.charAt(right)) == crr.get(s.charAt(right))) {
                have++;
            }

            while (have == need) {
                if ((right - left) < Max_len) {
                    Max_len = right - left;
                    res[0] = left;
                    res[1] = right;
                }
                if (crr.containsKey(s.charAt(left)) && crr.get(s.charAt(left)) != 0) {
                    crr.put(s.charAt(left), crr.get(s.charAt(left)) - 1);
                }

                if (crr.containsKey(s.charAt(left)) && crr.get(s.charAt(left)) < hashT.get(s.charAt(left))) {
                    have--;
                }

                left++;
            }
        }
        for (int elem : res) {
            System.out.println("the results are ");
            System.out.println(elem);

        }

    }
}
