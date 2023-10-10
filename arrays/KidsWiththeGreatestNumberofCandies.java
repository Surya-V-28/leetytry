

import java.util.*;


public class KidsWiththeGreatestNumberofCandies  {
    public static void main(String args[]){
        System.out.println("Wprllong");
        int[] arr = {2,3,5,1,3};
        int extra = 3;
        int max = Arrays.stream(arr).max().getAsInt();
        boolean[] fans = new boolean[arr.length];

        for(int i =0;i<arr.length;i++){
            if(arr[i]+extra >= max){
                fans[i] = true;
            }
            else {
                fans[i] = false;
            }
        }

        for(boolean val:fans){
            System.out.println(val);
        }
    }
}
