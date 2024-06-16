


import java.util.*;
public class MissingNumberIn {
    public static void main(String args[]) {
        System.out.println("Working");
        int n = 5;
        int arr[] = {1,2,3,5};
        Arrays.sort(arr); 
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]-1){
                System.out.println(arr[i]+1);
            }
        }

    }
}