


import java.util.* ;
import java.lang.Math;


public class GreatestCommonDivide {
    public static void main(String args[]) {
        System.out.println("Wokring surya");
        String news = "";
        String one = "ABCABCDE" , two = "ABCDE";
        int j=0;
         int n = Math.max(one.length(),two.length());
         String maxlenstring  = one.length()==n?one:two;
         String minlenstring  = one.length()!=n?one:two;
         System.out.println(minlenstring);
        for(int i=0;i<n;i++){
            if(minlenstring.charAt(j) ==maxlenstring.charAt(i) && j<minlenstring.length()){
                System.out.println(" this IS " + j+" "+  one.charAt(j)+   " i as " + i + " "+ maxlenstring.charAt(i));
                j++;
            } else {
                j=0;
                System.out.println(" this si the I value " + i );
                System.out.println(" this IS " + j+" "+  one.charAt(j)+   " i as " + i + " "+ maxlenstring.charAt(i));
            }
        }

    }
}