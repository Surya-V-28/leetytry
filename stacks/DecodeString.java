
import java.util.*;
public class DecodeString  {
    public static void main(String args[]) {
        System.out.println("Working");

        String name  = "";
        String output = "";
        String times = "";
        boolean check = true;
        Stack<Character> stk = new Stack<>();

        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==']'){
                while(!stk.isEmpty()){
                    if(stk.peek()=='[' && check){
                       stk.pop();

                    }
                    else {
                        output = stk.pop() + output;
                    }
                    stk.pop();

                }

            }
            else if(name.charAt(i) =) {

            }
            else {
                stk.push(name.charAt(i));
            }
        }

    }
}