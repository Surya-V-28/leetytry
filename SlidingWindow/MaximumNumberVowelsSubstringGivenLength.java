


import java.util.*;

public class MaximumNumberVowelsSubstringGivenLength {
    public static void main(String args[]) {
        System.out.println("Working");
        String s = "weallloveyou";
        int k=7;
        int count = 0;
        HashMap<Character,Integer> hash = new HashMap<>();
        hash.put('a',1);
        hash.put('e',1);
        hash.put('i',1);
        hash.put('o',1);
        hash.put('u',1);
        int max=0;
        for(int i=0;i<k;i++){
            if(hash.get(s.charAt(i)) !=null){
                count = count+ hash.get(s.charAt(i));
            }
        }
       // System.out.println(count);
        max = Math.max(count,max);

        for(int i=k;i<s.length();i++){
            if(hash.get(s.charAt(i)) !=null) {
            count = count + hash.get(s.charAt(i));
            }
            if(hash.get(s.charAt(i-k)) !=null) {
                count = count - hash.get(s.charAt(i-k));
            }
            max = Math.max(count,max);
        }
        System.out.println(max);

    }
}