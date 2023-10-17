



import java.util.*;


public class IsSequence {
    public static void main(String args[]) {
        System.out.println("Working");
        String one = "acb", two = "ahbgdc";
        int i =0;
        
         while(i<one.length()){
            if(two.indexOf(one.charAt(i))==-1){
                System.out.println("element not found in the arrays");
                System.out.println(one);
            }
            i++;
         }
    }

    public static void GivenMethod(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        System.out.println(i == s.length());
    }
}