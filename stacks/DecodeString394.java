

import java.util.*;

public class DecodeString394 {


    public static void main(String args[]) {
        String input = "3[ab]2[bc]";
        Stack<Integer> inSt = new Stack<>();
        Stack<String> Stk = new Stack<>();
        StringBuilder s = new StringBuilder();
        String prs = "";
        int num = 0;
        
        for(char c : input.toCharArray()) {
            if(Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if(c == '[') {
                inSt.push(num);
                num = 0;
                Stk.push(prs);
                prs = "";
            } else if(c == ']') {
                StringBuilder tempStr = new StringBuilder(Stk.pop());
                int tempNum = inSt.pop();
                for(int i = 0; i < tempNum; i++) {
                    tempStr.append(prs);
                }
                prs = tempStr.toString();
            } else {
                prs += c;
            }
        }
        
        System.out.println(prs);
    }
}