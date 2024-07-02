

import java.util.*;

public class ThreeConsectiveOdd {
    public static void main(String args[]){
        System.out.println("Wokring");
         int[] arr= {1,2,34,3,4,5,7,23,12};
         int j =3;
         for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                j--;
                if(j==0){
                    System.out.println("True");
                    break;
                } 
            } else {
                j=3;
            }
         }
    }
}