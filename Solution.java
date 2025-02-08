
import java.io.*;
import java.util.*;

public class Solution {

    public void solve() throws IOException {
        // Use BufferedReader for fast input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read input strings
        String s1 = br.readLine().trim();
        String s2 = br.readLine().trim();

        // Create a mapping of characters based on their order in s1
        LinkedHashMap<Character, Character> mapping = new LinkedHashMap<>();
        int index = 0;

        // Preserve order while removing duplicates
        for (char c : s1.toCharArray()) {
            if (!mapping.containsKey(c)) {
                mapping.put(c, (char) ('a' + index));
                index++;
            }
        }

        // Transform s2 using the mapping
        StringBuilder result = new StringBuilder();
        for (char c : s2.toCharArray()) {
            result.append(mapping.get(c));
        }

        // Print the transformed string
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        new Solution().solve();
    }
}
