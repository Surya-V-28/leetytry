
import java.util.*;

public class WordSubsets {

    public List<String> wordSubsets(String[] words1, String[] words2) {
        HashMap<Character, Integer> combinedHash = new HashMap<>();
        for (String str : words2) {
            HashMap<Character, Integer> hash = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                hash.put(str.charAt(i), hash.getOrDefault(str.charAt(i), 0) + 1);
            }
            for (Map.Entry<Character, Integer> entry : hash.entrySet()) {
                if (combinedHash.containsKey(entry.getKey())) {
                    combinedHash.put(entry.getKey(), Math.max(entry.getValue(), combinedHash.get(entry.getKey())));
                } else {
                    combinedHash.put(entry.getKey(), entry.getValue());
                }
            }
        }
        System.out.println(combinedHash);
        List<String> ans = new ArrayList<>();

        for (String s : words1) {
            HashMap<Character, Integer> hashed = new HashMap<>();
            boolean anstoAdded = false;
            for (int i = 0; i < s.length(); i++) {
                hashed.put(s.charAt(i), hashed.getOrDefault(s.charAt(i), 0) + 1);
            }
            for (Map.Entry<Character, Integer> entry : combinedHash.entrySet()) {
                if (!hashed.containsKey(entry.getKey())) {
                    anstoAdded = true;
                    break;
                } else if (hashed.get(entry.getKey()) < entry.getValue()) {
                    anstoAdded = true;
                    break;
                }
            }

            if (!anstoAdded) {
                ans.add(s);
            }
        }
        return ans;
    }
}
