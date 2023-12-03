

import java.util.*;


public class  AsteroidCollision {
    public static void main(String args[]){
        System.out.println("Working");
        int[] asteroids = {5,10,-5};

        Stack<Integer> stk = new Stack<>();
       // stk.push(nums[0]);
       for(int i=0;i<asteroids.length;i++){
        if(stk.isEmpty()){
            stk.push(asteroids[i]);
        }
        else if((stk.peek()>0 && asteroids[i]>0) || (stk.peek()<0 && asteroids[i]<0)) { 
            stk.push(asteroids[i]);
        }
        else if(stk.peek()>0 && stk.peek() == -asteroids[i]) stk.pop();
        else if(stk.peek()>0 && asteroids[i]<0) {
            stk.pop();
        }
        
    }
        System.out.println(stk);
    }
}