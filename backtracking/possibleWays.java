


import java.util.*;

public class possibleWays {
    public static void  main(String args[]){
        int input = 5;

        ArrayList<Integer[]> result = new ArrayList<Integer[]>();

        backtrack(0, input, new Integer[] {-1, -1, -1,-1,-1}, result);

        System.out.println("Result:\n" + resultToString(result));
    }
    private static void backtrack(int index, int input, Integer[] previousCombination, ArrayList<Integer[]> result) {
        if (index >= input) {
            return;
        }

        // Possible 0 - Input
        for (int i = 0; i <= input; ++i) {
            Integer[] newCombination = previousCombination.clone();
            newCombination[index] = i;

            if (index == input - 1) {
                if (arraySum(newCombination) == input) {
                    result.add(newCombination);
                }
            }
            
            backtrack(index + 1, input, newCombination, result);
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



