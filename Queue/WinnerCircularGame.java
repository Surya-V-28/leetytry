


import java.util.*;

public class WinnerCircularGame {
    public static void main(String args[]){
        System.out.println("Wokring");
        int n = 5, k = 2;
       Queue<Integer> que = new  LinkedList<>();
        for(int i=1;i<=5;i++) que.add(i);
        System.out.println(que);
        
        while(que.size()>1){
            for(int j=1;j<k;j++){
                int a = que.peek();
                que.add(a);
                que.poll();
            }
            que.poll();
        }
        System.out.println(que);
    }
}