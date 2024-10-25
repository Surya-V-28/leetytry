import java.util.*;

public class StringsAppearedUsingTwoKeys {
    public static void main(String args[]) {
        System.out.println("WOkring");
        String target = "he";
        int i=0;
        List<String> ls = new ArrayList<>();
        StringBuilder sd = new StringBuilder();
        while(i<target.length()) {
           
           if(sd.length()<i+1) {
            sd.append('a');
            ls.add(sd.toString());
           } 
           if(i < sd.length() && target.charAt(i)==sd.charAt(i)){
            i++;
           } else { 
              while(sd.charAt(i)!=target.charAt(i)) {
                char lastChar = sd.charAt(sd.length() - 1);
                sd.deleteCharAt(sd.length() - 1);
                char nextChar = (char) ((lastChar - 'a' + 1) % 26 + 'a');
                sd.append(nextChar);
                ls.add(sd.toString());
              }
           }
        }
        System.out.println(ls);

    }
}