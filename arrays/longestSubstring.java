
import java.util.HashMap;
import java.util.*;
class longestSubstring { 
    public static void main(String args[]) {
        String s =  "aab";
        int j=0,max=0;
        boolean rech= true;
        HashMap<Character  ,Integer> hash = new HashMap<>();
        for(int i=0;i<s.length();i++){
          System.out.println(s.length());
          if(s.length()==1){
            System.out.println("this enter if statement");
             
          }
          if(hash.get(s.charAt(i))==null){ 
               hash.put(s.charAt(i),i);
               System.out.println(hash);
               rech= true;
          }
          else  {
              j++;
              i=j;
              rech= false;
              max= max>hash.size()? max:hash.size();
              hash.clear();
              System.out.println(hash);
          }
          
        }
        if(rech){
          System.out.println("this enter if statement");
          max= hash.size();
        }
       
         System.out.println(max);
    }
}