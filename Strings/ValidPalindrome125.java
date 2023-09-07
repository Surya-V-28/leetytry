

import java.util.*;
import java.lang.*;

public class ValidPalindrome125 {
    public static void main(String args[]){
        System.out.println("Wokring");

        String given = "A man, a plan, a canal: Panama";
        String newstr = "";
        for(int i=0;i<given.length();i++){
            if(Character.isDigit(given.charAt(i))|| Character.isLetter(given.charAt(i))){
                newstr +=given.charAt(i);
            }
        }
        newstr = newstr.toLowerCase();
        System.out.println(newstr.toLowerCase());
        int s_pointer=0, e_pointer=newstr.length()-1;
        while(s_pointer<e_pointer){
            if(newstr.charAt(s_pointer)!=newstr.charAt(e_pointer)){
                System.out.println("Wokring in False case ");
                System.out.println(" the letter is " + newstr.charAt(s_pointer));
            }
            s_pointer++;
            e_pointer--;
        }
        return true;
    }
}