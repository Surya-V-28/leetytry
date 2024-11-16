
import java.util.*;


public class ShortestSubSortArray {
    public static void main(String args[]){
        System.out.println("Working the code");
        int[] arr = {1,2,3,10,4,2,3,5};
        ArrayList<Integer> harr = new ArrayList<>();
        harr.add(arr[0]);
        for(int i=0;i<arr.length-1;i++){
            if(harr.get(harr.size()-1)<arr[i+1]){
             harr.add(arr[i+1]);
            }
        }

        // if(arr[i]<arr[i+1])
        System.out.println(harr);
    }
}