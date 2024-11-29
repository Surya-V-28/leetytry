


import java.util.*;

public class SplitTwoDigitandFindMinium {
    public static void main(String args[]) {
        int n =  4009;

       int[] arr = new int[4];
       int remainder;

    int i=3;
    while(n>0){
        remainder = n%10;
        n = n/10;
        arr[i] = remainder;
        i--;
    }
    
    Arrays.sort(arr);
    for(int val:arr){
        System.out.println(val);
    }
    int result = (arr[0]*10+ arr[2])+(arr[1]*10+arr[3]);
     System.out.println(result + " this is the result");




    }
}