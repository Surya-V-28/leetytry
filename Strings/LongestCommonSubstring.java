
public class LongestCommonSubstring {

    public static void main(String args[]) {
        System.out.println("Worksing");
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
}
