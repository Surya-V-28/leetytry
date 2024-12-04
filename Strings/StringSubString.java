
public class StringSubString {

    public static int getIntCharVal(char c) {
        return ((int) c - 'a') % 26;
    }

    public static int getIntCharValPlusOne(char c) {
        return ((int) c - 'a' + 1) % 26;
    }

    public static void main(String args[]) {
        String str1 = "ab";
        String str2 = "d";

        int i = 0, j = 0;

        for (i = 0; i < str1.length(); i++) {
            if (j < str2.length() && (getIntCharVal(str1.charAt(i)) == getIntCharVal(str2.charAt(j)) || getIntCharValPlusOne(str1.charAt(i)) == getIntCharVal(str2.charAt(j)))) {
                j++;
            }
        }
        if (j == str2.length()) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }
    }
}
