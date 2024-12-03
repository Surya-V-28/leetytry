

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