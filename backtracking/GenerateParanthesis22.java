import java.util.*;




public class GenerateParanthesis22 {
    public static void main(String args[]){
        System.out.println("Wokring");
        int number = 3;

        // this problem willl be solved by the backtracking methods lets see  how we can able to slove this

        /// all the possible combinations 
        List<String> result  =  new ArrayList<>();

        backTack("",0,0,number,result);
        System.out.println(result);
    }

    public static void backTack(String current_combinations , int open, int close,int max, List<String> result){
        //base conditions 
        if(current_combinations.length()==2*max){
            result.add(current_combinations);
            return;
        }

        if(open<max) backTack(current_combinations+"(",open+1,close,max,result);
        if(close<open) backTack(current_combinations+")", open, close+1,max,result);
    }


}