


import java.util.*;


public class BasicTracking {
    public static void main(String args[]){
        System.out.println("wORKING");

        int number = 5;
        int index =0;
        Integer[] start = {-1,-1,-1};
        ArrayList<Integer[]> result = new ArrayList<Integer[]>();
        backTracking(index,number,start,result);
        System.out.println("Result:\n" + resultToString(result));
    }

    public static void backTracking(int index,int inputs, Integer[] previousCombination , ArrayList<Integer[]>  reuslt){
        if(index>=3){
            return;
        }
        for(int i=0;i<=5;i++){
            Integer[] newCombination = previousCombination.clone();
            newCombination[index] = i;

            // when index reaching the max value count the final result total equal to normal total 
            if(index == 2){
                if(arraySum(newCombination)==5){
                    reuslt.add(newCombination);
                }
            }
            backTracking(index+1,3,newCombination,reuslt);

        }
    }


    private static int arraySum(Integer[] numbers) {
        int r = 0;
        for (int number : numbers) {
            r += number;
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