

import java.util.*;
public class CountPairs {
    public static void main(String[] args) {
        System.out.println("Worrking");
        // int[] hours = {72,48,24,3};
        // int result= 0;

        // for (int i=0;i<hours.length;i++){
        //     for(int j=1+i;j<hours.length;j++){
        //         if((hours[i]+hours[j])%24==0){
        //             result++;
        //         }
        //     }
        // }
        // System.out.println(result);
        int[] hours = {72,48,24,3};  // Example array
        int result = 0;

        // Create a hashmap to store the count of remainders
        HashMap<Integer, Integer> remainderCount = new HashMap<>();

        for (int hour : hours) {
            int remainder = hour % 24;
            int complement = (24 - remainder) % 24;  
            if (remainderCount.containsKey(complement)) {
                result += remainderCount.get(complement);
            }
            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }

        System.out.println(result);
    }
}
