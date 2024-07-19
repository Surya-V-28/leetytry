

import java.util.*;

public class Longestalternatingsubsequence {
    public static void main(String args[]){
       System.out.println("Working in this surya");
       int[]  arr= {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
       int result =1;
       for(int i=1;i<arr.length-1;i++){
        if(arr[i-1]>arr[i] && arr[i]<arr[i+1]){
            result++;
        }
        else if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
            result++;
        } 
       }
       int num = arr.length-1;
      if((arr.length-1==num) && ((arr[num-1]<=arr[num])||(arr[num-1]>=arr[num]))) {
        result++;
        }
       System.out.println(result);

    }
}