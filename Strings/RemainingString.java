


import java.util.*;


public class RemainingString {
    public static void main(String args[]){
        System.out.println("Working well with me");
        String s = "Thisisdemostri";
        char ch = 'i';
        int  count = 3;
        if(s.indexOf(ch)==-1) System.out.println("No String");
        int count1=0;
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                count1++;
                
            }
            if(count1==count)break;
        }
        if (count1 < count) return ""; 
        if(i<s.length()) System.out.println("No String");
        System.out.println(s.substring(i+1)+ "addded");

    }

}