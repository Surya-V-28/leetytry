

import java.util.*;
import java.lang.*;

public class validanagram242 {
    public static void main(String args[]){
        String s1 = "anagram", t1 = "nagaram";
        WaysDifferent helper = new WaysDifferent();
        helper.allBuiltInFunctions(s1,t1);
        helper.withoutBuiltFunctions(s1,t1);
        helper.findByArrays(s1,t1);


        
    }
}

class WaysDifferent {
    void allBuiltInFunctions(String s1, String t1) {
        char[] s1arrsy = s1.toCharArray();
        char[] t1arrsy= t1.toCharArray(); 
        Arrays.sort(s1arrsy);
        Arrays.sort(t1arrsy);
        String ans = new  String(s1arrsy);
        String ans1 = new String(t1arrsy);
        if(ans.equals(ans1)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
       }
    }
    void withoutBuiltFunctions(String s1, String t1) {
     HashMap<Character,Integer> hash = new HashMap<>();
     boolean values1 = false;
      for(int j=0;j<s1.length();j++){
        hash.put(s1.charAt(j),hash .getOrDefault(s1.charAt(j),0)+1);
      }
      for(int j=0;j<t1.length();j++){
        hash.put(t1.charAt(j),hash.getOrDefault(t1.charAt(j),0)-1);
      }
      for(int val:hash.values()){
        if(val!=0){
            System.out.println("false");
            values1 = true;
        }
      }
      if(values1){
        System.out.print("True");
      }
      

    }
    void findByArrays(String s1, String t1){
        int[] freq = new int[26];
        int flag = 0;
        if(s1.length()!=t1.length()){
            System.out.println("False");
        }
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[t1.charAt(i) -'a']--;
        }

        for(int j=0;j<26;j++){
            if(freq[j] !=0){
                System.out.println("False");
                flag = 1;
            }
        }
        if(flag==0){
            System.out.println("True");

        }
        
    }
}