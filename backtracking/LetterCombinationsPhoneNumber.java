
import java.util.*;


public class LetterCombinationsPhoneNumber {

    public static void backTraking(int index,String digits,ArrayList<String> arr,StringBuilder CurrentCominations,HashMap<Character,String> hash){
        if(index ==digits.length()){
            arr.add(CurrentCominations.toString());
            return;
        }
        char gotChar = digits.charAt(index);
        for(char ch : hash.get(gotChar).toCharArray()){
            CurrentCominations.append(ch); 
            backTraking(index+1,digits,arr,CurrentCominations,hash);
            CurrentCominations.deleteCharAt(CurrentCominations.length() - 1);
        }

    }

    public static void main(String args[]){

        System.out.println("Working");
        String digits = "23";
         HashMap<Character,String> hash= new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        hash.put('2', "abc");
        hash.put('3', "def");
        hash.put('4', "ghi");
        hash.put('5', "jkl");
        hash.put('6', "mno");
        hash.put('7', "pqrs");
        hash.put('8', "tuv");
        hash.put('9', "wxyz");
        if (digits == null || digits.length() == 0) {
            System.out.println("not answers");
        }
        
        StringBuilder curr = new StringBuilder();
        backTraking(0,digits,arr,curr,hash);
        System.out.println(arr);
    }
}