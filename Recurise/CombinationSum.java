
import java.util.*;

public class CombinationSum {
    public static void main(String args[]) {
        System.out.println("Working");
        int[] candidates  = {2,3,6,7};
        int target  =7;
        ArrayList<ArrayList<Integer>> fin = new ArrayList<ArrayList<Integer>>();
        Combinations(0,7,candidates.length,candidates,new ArrayList<Integer>(),fin);
        System.out.println(fin);
        
    }


    public static void Combinations(int i,int remain,int leng,int[]  candidates,  ArrayList<Integer> res, ArrayList<ArrayList<Integer>> fin) {
        if(i==leng) {
            if(remain==0) {
                fin.add(new ArrayList<>(res)); // all the object class are reference by variable , so its better to create the new instance to store
            }
            return;
        }
       
        if(candidates[i]<=remain){
        res.add(candidates[i]);
        Combinations(i,remain-candidates[i], leng, candidates,res, fin);
        res.remove(res.size()-1);
        }
        Combinations(i+1,remain, leng, candidates, res, fin);
    }
}