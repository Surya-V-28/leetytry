


 import java.util.*;


 public class PalindromeInteger {
    public static void main(String args[]){
        System.out.println("Working");
        int number = 232;
        PalindromeIntegerWays.withOutStringCascading(number);
        PalindromeIntegerWays.withMidSearch(number);
        
    }
 }


class PalindromeIntegerWays {
     static void StrinfCascading(int number){
        String con = Integer.toString(number);
        String two = "";
        for(int i=con.length()-1; i>=0;i--){
            two = ""+ two+con.charAt(i);
        }
        System.out.println(two);
        if(con.equals(two)){
            System.out.println("True");

        }
        else {
            System.out.println("False");
        }
     }

     static void withOutStringCascading(int number){
        if(number<0){
            System.out.println("False");
        }
        else {
            int reverse=0,rem;
            int ans = number;
            while(number>0){
                rem = number%10;
                reverse = reverse*10+ rem;
                number = number/10;
            }
            if(reverse==ans){
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }
     }

     static void withMidSearch(int number){
        String s = String.valueOf(number);
        int leng = s.length();
        for(int i=0;i<s.length()/2+1;i++){
            if(s.charAt(i)!=s.charAt(leng-i-1))  System.out.println("false");
        }
        System.out.println("true");

     }
}