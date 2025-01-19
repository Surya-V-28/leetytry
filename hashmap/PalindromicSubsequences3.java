
import java.util.HashMap;
import java.util.HashSet;

class Pair {

    Character mid;
    Character outer;

    Pair(Character _mid, Character _outer) {
        mid = _mid;
        outer = _outer;
    }

}

public class PalindromicSubsequences3 {

    public static void main(String[] args) {
        System.out.print("Working");
        String s = "aabca";
        int ans = 0;
        HashMap<Character, Integer> hash = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        HashSet<Pair> setAns = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            hash.put(s.charAt(i), hash.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            hash.put(s.charAt(i), hash.getOrDefault(s.charAt(i), 0) - 1);

            for (Character elem : set) {
                if (hash.get(elem) > 0) {
                    setAns.add(new Pair(s.charAt(i), elem));
                }
            }
            set.add(s.charAt(i));
        }
        System.out.println("the answer for the solution is " + setAns.size());
    }
}
