

public class StringPlacePutter {
    public static void main(String args[]) {
        System.out.println("Working");

        String s = "LeetcodeHelpsMeLearn";
        String[] sarr = s.split("");
        int[] spaces = { 8,13,15};

        String res ="";

        for(int i: spaces) {
            sarr[i] = " " + sarr[i];
        }

        for(String ss: sarr){
          res +=ss;
        }
        System.out.println(res);
    }
}
class Solution {

    public String addSpaces(String s, int[] spaces) {
        // StringBuilder for efficient string construction
        StringBuilder result = new StringBuilder();
        int spaceIndex = 0;

        for (int stringIndex = 0; stringIndex < s.length(); stringIndex++) {
            if (
                spaceIndex < spaces.length && stringIndex == spaces[spaceIndex]
            ) {
                // Insert space at the correct position
                result.append(' ');
                spaceIndex++;
            }
            // Append the current character
            result.append(s.charAt(stringIndex));
        }
        return result.toString();
    }
}