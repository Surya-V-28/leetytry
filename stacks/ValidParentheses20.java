

import java.util.*;

public class ValidParentheses20 {
    public static void main(String args[]) {
        System.out.println("Working");
       String s = "([]{";
       Stack<Character> stk = new Stack<>();
       HashMap<Character,Character> hash = new HashMap<>();
       hash.put(')','(');
       hash.put(']','[');
       hash.put('}','{');

       stk.push(s.charAt(0));
       int i =1;
       while(i<s.length()){
        char c = s.charAt(i);
        if(stk.empty()==false && stk.peek()==hash.get(c)){
            stk.pop();
        }else {
            stk.push(s.charAt(i));
        }
        i++;
       }
       if(stk.empty()){
        System.out.println("Working True" );
       }else {
        System.out.println("Working False" );
       }

         boolean value =  ValidParentheses20Ways.SomeOtherWays("((((");
         System.out.println(value);
    }
}



class ValidParentheses20Ways {
    static boolean SomeOtherWays(String s) {
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()
             ) {
            if(x=='('){
                stack.push(')');
            } else if (x=='{') {
                stack.push('}');
                
            } else if (x=='[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop()!=x){
                return false;
            }
        }
        return stack.isEmpty();
    }
}