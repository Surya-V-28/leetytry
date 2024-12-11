
import java.util.*;

public class LongestCommonSubstring {

    public static void bruteForce() {
        String s = "abcaba";
        int counter = 1;
        int ans = Integer.MAX_VALUE;

        //brute force for the solution 
        for (int i = 0; i < s.length(); i++) {
            char start = s.charAt(i);
            int countSubApperance = 1;
            if (counter == 3) {
                break;
            }
            for (int j = 0 + i; j < s.length(); j++) {

                if (start == s.charAt(j)) {
                    countSubApperance++;
                    counter++;
                }
            }
            ans = Math.min(ans, countSubApperance);

        }
        System.out.println("the answer is " + ans);

    }

    public static void main(String args[]) {
        System.out.println("Worksing");
        String s = "aaaa";
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            int index = i;
            while (index < s.length() && s.charAt(index) == s.charAt(i)) {
                arr.add(s.substring(i, index + 1));
                index++;
            }
        }

        System.out.println("arr is " + arr);

        HashMap<String, Integer> hash = new HashMap<>();
        for (String name : arr) {
            hash.put(name, hash.getOrDefault(name, 0) + 1);
        }
        int maxLen = 0;

        for (Map.Entry<String, Integer> entry : hash.entrySet()) {
            String ans = entry.getKey();
            Integer val = entry.getValue();

            if (val >= 3) {
                maxLen = Math.max(maxLen, ans.length());
            }
        }
        System.out.println("arr is hash " + hash);
        System.out.println("ans is value " + maxLen);

        //Sliding Window;
    }
}
