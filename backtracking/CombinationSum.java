


import java.util.*;


public class CombinationSum {
    public static void main(String args[]){
        System.out.println("Working");
        int k =3, t= 9, currSum=0;
        boolean flager[] = new boolean[9];
        ArrayList<Integer> samp= new ArrayList<>();
        Set<ArrayList<Integer>> result = new HashSet<>();
        backtrack(result, samp, k, t, 1,currSum);
        System.out.println(result);
    }
   
}