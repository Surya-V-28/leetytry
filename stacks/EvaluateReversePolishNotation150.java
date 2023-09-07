


import java.util.*;

public class  EvaluateReversePolishNotation150 {
    public static void main(String args[]) {
        System.out.println("Working");
        String[] arrs = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        Stack<Integer> stck = new Stack<Integer>();
        for(int i=0;i<arrs.length;i++){
             makeSwitch(arrs[i],stck);
           
        }
    }
    public static void makeSwitch(String nums,Stack<Integer> stck) {
        int a,b,result;
        switch(nums){
            case "+":
                a = stck.pop();
                b = stck.pop();
               result = a+b;
               stck.push(result);
               break;
            case "-":
                System.out.println("Worling in - ");
                a = stck.pop();
                b = stck.pop();
               result = a-b;
               stck.push(result);
                break;
            case "*":
               System.out.println("Worling in * ");
               a = stck.pop();
               b = stck.pop();
              result = a*b;
              stck.push(result);
               break;
            case "/":
               System.out.println("Worling in / ");
               a = stck.pop();
               b = stck.pop();
              result = b/a;
              stck.push(result);
               break;
            default :
                int nums1 = Integer.parseInt(nums);
                stck.push(nums1);
        }
         System.out.println(stck.peek());
    }
}
