

import java.util.*;

public class DecodeString394 {


    public static void main(String args[]) {
        String input = "3[ab]2[bc]";
        Stack<Integer> inSt = new Stack<Integer>();
        Stack<String> Stk = new Stack<String>();
        String prs = "";
        for(int i=0;i<input.length();i++){
            if(Character.isDigit(input.charAt(i))){
                System.out.println(input.charAt(i) + " thi id numbre");
                inSt.push(Character.getNumericValue(input.charAt(i)));
            } else {
               if(input.charAt(i)==']'){
                while(Stk.peek()!="["){
                 prs = Stk.pop()+prs+ "";
                 System.out.println(Stk);
                }
                System.out.println(Stk);
                Stk.pop();
                System.out.println(prs.substring(0,prs.length())+ "some");
                prs = prs.substring(0,prs.length());
                Stk.push(prs);
                System.out.println(Stk);
                prs =""; 
               }
               Stk.push(input.charAt(i)+"");
            }
        }
        System.out.println(Stk);
        System.out.println(inSt);
    }
}