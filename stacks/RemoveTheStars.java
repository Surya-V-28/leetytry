

import java.util.*;


public class RemoveTheStars {
    public static void main(String args[]){
        System.out.println("Working");
        String s = "leet**cod*e";
        String res="";
        Stack<Character> stk = new Stack<>();
        for(int i =0;i<s.length();i++){
            stk.push(s.charAt(i));
            if(stk.peek()=='*'){
               if(!stk.isEmpty() ) {stk.pop();
                 stk.pop() ;}
            }
        }
        System.out.println(stk);
        int leen  =stk.size();
        char[] arr = new char[stk.size()+1];
        int i=0;
        while(!stk.isEmpty()){
            arr[i] = stk.pop();
            i++;
        }
        for(int i1=leen-1;i1>=0;i1--) {
            res = res +arr[i1]+"";
            
        }
        System.out.println(res);
        
    }
}