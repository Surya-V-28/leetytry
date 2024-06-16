
import java.util.*;

public class MinClimbingStairs {
    public static void main(String args[]) {
        System.out.println("Wokring");

        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int temp1=0,temp=0, res;
        for(int i=cost.length-1;i>=0;i--){
              if(i==cost.length-1){
                cost[i] = cost[i] +0;
                temp = cost[i];
                temp1 = cost[i];
              }
              else if(i+2==cost.length) {
                temp1 = cost[i] + 0;
                temp = cost[i] + cost[i+1];
              } 
              else {
                 temp1 = cost[i] + cost[i+2];
                 temp = cost[i] + cost[i+1];
            }
            res = Math.min(temp, temp1);
            cost[i] = res;
        }  
        for(int i=0;i<cost.length;i++){
            System.out.print(cost[i] + ", ");
        }
        int anser = Math.min(cost[0],cost[1]); 
         
    }
}

