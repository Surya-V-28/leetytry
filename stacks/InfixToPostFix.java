

import java.util.*;


public class InfixToPostFix {
    public static void main(String args[]){
        System.out.println("Working");
        HashMap<Character, Integer> hash = new HashMap<>();
        hash.put('+',1);
        hash.put('-',1);
        hash.put('*',2);
        hash.put('/',2);
        hash.put('^',3);
        Stack<Character> stk = new Stack<Character>();
        String str = "(a+b)*c-d/e^f";
        String ans ="";
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                ans = ans + str.charAt(i);
            }
            else if(!stk.isEmpty() && str.charAt(i)==')'){
                while(!stk.isEmpty() && stk.peek() !='(' && hash.containsKey(stk.peek()) && hash.get(stk.peek())>=hash.get(str.charAt(i))){
                    ans = ans + stk.pop();
                }
                stk.pop();
            } else if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/' || str.charAt(i) == '%' || str.charAt(i) == '^' || str.charAt(i) == '('){
                if(stk.isEmpty() ||str.charAt(i) == '(' ) {
                    stk.push(str.charAt(i));
                } else if(!stk.isEmpty()) {
                    while(!stk.isEmpty() &&  hash.containsKey(stk.peek()) && hash.get(stk.peek())>=hash.get(str.charAt(i))){
                        ans = ans + stk.pop();
                    }
                    stk.push(str.charAt(i));
                }  else  {
                    stk.push(str.charAt(i));
                }
            }
        }
        while(!stk.isEmpty()) {
            ans = ans + stk.pop();
        }
        System.out.println(ans);
    }
}