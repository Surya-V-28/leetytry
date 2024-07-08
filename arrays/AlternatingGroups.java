


import java.util.*;


public class AlternatingGroups {
    public static void main(String args[]){
        System.out.println("Working");
        int result =0;
        int[] colors = {0,1,0,};
        if(colors.length ==3) {
            if(colors[0]==colors[2] && colors[0]!=colors[1]){
                result++;
            }
            
        }
        for(int i=0;i<colors.length-2;i++){
            if(colors[i]==colors[i+2] && colors[i+1]!=colors[i+2]){
               result++;
            }
        }
        if(colors[colors.length-1]==colors[1] && colors[0]!=colors[1]){
            result++;
        }
        if(colors[colors.length-2]==colors[0] && colors[1]!=colors[0]){
            result++;
         }

        System.out.println(result);
    }
}