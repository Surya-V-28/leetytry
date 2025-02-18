
import java.util.*;

public class PremutatuionOfString {

    public static void generateAll(int start, ArrayList<String> arr, String CurrWord, String givenString) {
        if (CurrWord.length() == givenString.length()) {
            arr.add(CurrWord);
            return;
        }

        for (int i = 0; i < givenString.length(); i++) {
            if ((CurrWord.indexOf(givenString.charAt(i))) == -1) {
                CurrWord += givenString.charAt(i);
                generateAll(i + 1, arr, CurrWord, givenString);
                CurrWord = CurrWord.substring(0, CurrWord.length() - 1);
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Working on the code");
        String s = "abc";
        ArrayList<String> arrr = new ArrayList<>();

        generateAll(0, arrr, "", s);
        System.out.println(arrr);

    }
}
