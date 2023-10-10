


import java.util.* ;
import java.lang.Math;


public class GreatestCommonDivide {
    public static void main(String args[]) {
        System.out.println("Wokring surya");
        String news = "";
        String one = "ABCABCDE" , two = "ABCDE";
        String ans = gcdofString(one,two);
        System.out.println(ans);
       
    }



    public static String gcdofString(String one , String two) {
        if(one.equals(two)){
            return one;
        }
        if(one.length()<two.length()){
            return gcdofString(two,one);
        }

        if(one.startsWith(two)){
            return gcdofString(one.substring(two.length()),two);
        }
        return "";
    }
}