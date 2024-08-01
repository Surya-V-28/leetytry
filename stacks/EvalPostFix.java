

import java.util.*;
public class EvalPostFix {
    public static void main(String args[]) {
        System.out.println("Working ");
         String S =  "231*+9-";
         Stack<Integer> stk =new Stack<Integer>();
         int ans =0;
         for(int i=0;i<S.length();i++){
            if(Character.isDigit(S.charAt(i))){
             stk.push(Integer.valueOf(S.charAt(i)+""));
            }
            else if(!Character.isDigit(S.charAt(i))) {
                int b = stk.pop();
                int a = stk.pop();
                if (S.charAt(i) == '+') {
                    // Handle addition
                    stk.push(a+b);
                } else if (S.charAt(i) == '-') {
                    // Handle subtraction
                    stk.push(a-b);
                } else if (S.charAt(i) == '*') {
                    // Handle multiplication
                    stk.push(a*b);
                } else if (S.charAt(i) == '/') {
                    // Handle division
                    stk.push(a/b);
                }
            }
         }
       System.out.println(stk);
    }
}