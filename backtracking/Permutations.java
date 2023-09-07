

import java.util.*;

public class Permutations {
    public static void main(String args[]){
        System.out.println("Working ");
        int[] nums = {1,2,3};
        int inputs = nums.length;
        int index =0;
        Integer[] start = new Integer[inputs-1];
        Arrays.fill(start,-1);
        ArrayList<Integer[]> result = new ArrayList<Integer[]>();
        backTracking(index, inputs, nums,new Integer[] {-1,-1,-1},result);
        System.out.println("Result:\n" + resultToString(result));
    }

    public static void backTracking(int index, int inputs, int[] nums, Integer[] previousCombination, ArrayList<Integer[]> result){
        if(index>=3){
            return ;
        }

        for(int i=0;i<inputs;i++){
            Integer[] newcombinations = previousCombination.clone();
            newcombinations[index] = nums[i];
            if(index==3-1){
                if(arraySum(newcombinations)==6){
                    
                    result.add(newcombinations);
                    
                }
            }
            backTracking(index+1,inputs,nums,newcombinations,result);
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


    
    }


