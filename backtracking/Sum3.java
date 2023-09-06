

import java.util.*;

public class Sum3 {
    public static void main(String args[]){
        System.out.println("Working ");
        int[] nums = {-1,0,1,2,-1,-4};
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        }
        System.out.println(hash);
        int inputs = nums.length;
        ArrayList<Integer[]> result = new ArrayList<Integer[]>();
        int index =0;

        backTracking(index, inputs, nums,new Integer[] {-1,-1,-1},result,hash);
        Set<Integer[]> set = new HashSet<>();
        for (Integer[] array : result) {
             set.add(array);
        }
        System.out.println("Result:\n" + resultToString(result));
    }

    public static void backTracking(int index, int inputs, int[] nums, Integer[] previousCombination, ArrayList<Integer[]> result,HashMap<Integer,Integer> hash){
        if(index>=3){
            return ;
        }

        for(int i=0;i<inputs;i++){
            Integer[] newcombinations = previousCombination.clone();
            newcombinations[index] = nums[i];
            if(index==3-1){
                if(arraySum(newcombinations)==0){
                    if(CheckReduant(newcombinations,hash)){
                    result.add(newcombinations);
                    }
                }
            }
            backTracking(index+1,inputs,nums,newcombinations,result,hash);
        }
    }

    public static int arraySum(Integer[] nums) {
        int r =0;
        for(int i=0;i<nums.length;++i){
            r +=nums[i];
        }

        return r;
    }


    private static String resultToString(ArrayList<Integer[]> result) {
        String r = "{";

        for (int i = 0; i < result.size(); ++i) {
            r += "\n    {";
            for (int j = 0; j < result.get(i).length; ++j) {
                if (j != 0) r += "  ";
                
                r += result.get(i)[j];
            }
            r += "}";
        }

        r += "\n}";

        return r;
    }


    public static boolean CheckReduant(Integer[] newcombinations,HashMap<Integer,Integer> hash){
        boolean t = true;
        HashMap<Integer,Integer> hash1 = new  HashMap<>();
        for(int i=0;i<newcombinations.length;i++){
            hash1.put(newcombinations[i],hash1.getOrDefault(newcombinations[i],0)+1);
        }
        for(int j=0;j<newcombinations.length;j++){
            if(hash1.get(newcombinations[j])>hash.get(newcombinations[j]) ){
                t= false;
            }

        }
        hash1.clear();
        return t;
    }


}