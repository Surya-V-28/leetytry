
import java.util.*;



public class LongestSubStringWithoutRepeat3 {

    public static void main(String args[]){
        System.out.println("Working");
        String s = "abcdabcdedbb";
        LongestSubStringWithoutRepeat3Ways.goodAsKeyMethod(s);

    }
}



class  LongestSubStringWithoutRepeat3Ways {

    static  void goodAsKeyMethod(String s) {
        int[] charSet = new int[128]; // Assuming ASCII characters
        int max_length = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            left = Math.max(left, charSet[currentChar]);
            System.out.println(left);
            charSet[currentChar] = right + 1;
            max_length = Math.max(max_length, right - left + 1);
        }
        System.out.println(max_length);
        StringHelper.arrayPrinter(charSet);
        
    }

    static void slidingWindow(String s){
        // we will use th sliding window as for it we need to have the both start and end key as the limit of the windows
        int end =0,start=0;
        int maxLength = Math.min(s.length(),1);
        Set<Character> seen = new HashSet<>();
        while(end<s.length()){
           char c = s.charAt(end);
           while(seen.contains(c)){
            seen.remove(s.charAt(start));
            start++;
           }
            seen.add(c);
            int windowSize = end - start+1;
            maxLength = Math.max(maxLength,windowSize);
            end++;
        }
        System.out.println(maxLength);
    }
}


