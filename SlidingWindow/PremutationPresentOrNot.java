
import java.util.Arrays;

public class PremutationPresentOrNot {

    public static void main(String[] args) {
        System.out.println("Working");
        int[] charArr = new int[26];
        int[] compArr = new int[26];
        String s2 = "eidbaooo";
        String s1 = "ab";
        for (char c : s1.toCharArray()) {
            charArr[c - 'a']++;
        }
        int start = 0;

        for (int i = 0; i < s2.length(); i++) {
            compArr[s2.charAt(i) - 'a']++;

            if (i >= s1.length()) {
                compArr[s2.charAt(start) - 'a']--;
                start++;
            }

            if (Arrays.equals(charArr, compArr)) {
                System.err.println("Ture");
                return;
            }
        }
        System.out.println("False");

    }
}
