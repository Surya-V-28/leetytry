




import java.util.*;
import java.lang.Math;


public class MergeStringAlternate { 
    public static void main(String args[]) {
        System.out.println(" Working");
        String name1 = "abc"; 
        String name2 = "pqr";
        int lenLow = Math.min(name1.length(),name2.length());
        boolean bol = true ;
        int j=0,k=0;
        System.out.println("this is the  values of the integer " + lenLow);
        String got = "";
        for(int i =0; i<2*lenLow-1;i++){
            System.out.println("workins");
            if(bol) {
            got = got + name1.charAt(j);
            j++;
            bol = false;
            }
            else {
                got = got + name2.charAt(k);
                k++;
                bol = true;
            }

        }
       System.out.println("thid is the value of the  k " + k  + " and this is the j " + j );
       if(k<name2.length()) {
        got = got + name2.substring(k,name2.length());
        System.out.println(got + " in KL ");
       } 
       if (j<name1.length()) {
        got = got + name1.substring(j,name1.length());
        System.out.println(got);
       }
        

    }
}