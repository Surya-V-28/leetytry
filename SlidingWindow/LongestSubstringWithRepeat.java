
import java.util.*;
public class LongestSubstringWithRepeat {
    public static void main(String args[]) {
        System.out.println("Working ");
        String s = "pwwakew";
        HashMap<Character,Integer> hash = new HashMap<>();

        int left =0,right=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(hash.containsKey(s.charAt(i))){
               left = hash.get(s.charAt(i))+1;
               hash.put(s.charAt(i),i);
               ans = Math.max(ans,i-left+1);
            } else{
            hash.put(s.charAt(i),i);
            ans = Math.max(ans,i-left+1);
            }
        }
        System.out.println(ans);

    }
}