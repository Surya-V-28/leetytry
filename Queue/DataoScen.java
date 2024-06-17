
import java.util.*;
public class DataoScen {
    public static void main(String args[]) {


        System.out.println("Wokring");
        String senate = "RDD";
        int total = senate.length();
        Queue<Integer> radiant = new LinkedList<Integer>();
        Queue<Integer> dire = new LinkedList<Integer>();

        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R') {
             radiant.add(i);
            }
            else{
                dire.add(i);
            }
        }
        while(!radiant.isEmpty() && !dire.isEmpty()) {
              if(radiant.peek()<dire.peek()) {
                dire.remove();
                int ans = radiant.remove();
                total = total+1;
                radiant.add(total);  
              }
              else {
                radiant.remove();
                int ans =  dire.remove();
                total = total+1;
                dire.add(total);  
              }
        }
        if(radiant.isEmpty()){
            System.out.println("R is weak");
        }
        if(dire.isEmpty()){
            System.out.println("D is weak");
        }
    }
}