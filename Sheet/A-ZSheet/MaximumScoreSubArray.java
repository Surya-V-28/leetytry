
import java.util.*;

class MaximumScoreSubArray {
    public static void main(String args[]){
        System.out.println("Working");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(3);
        arr.add(1);
        arr.add(5);
        arr.add(6);
        int maxSum = 0;
        int currSum = arr.get(0) + arr.get(1);

        for(int i=1;i<arr.size()-1;i++){
            currSum = arr.get(i) + arr.get(i+1);
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println(maxSum);
    }
}