


import java.util.*;


public class  FindtheDifferenceofTwoArrays {
    public static void main(String args[]) {
        System.out.println("Wokring");
        int[] num1 = {1,2,3,3};
        int[] num2 = {2};
        List<List<Integer>>   arr = new ArrayList<>();
        HashSet<Integer> hash1 = new HashSet<>();
        HashSet<Integer> hash2 = new HashSet<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0;i<num1.length;i++){
            hash1.add(num1[i]);
        }
        System.out.println(hash1);
        for(int i=0;i<num2.length;i++){
            hash2.add(num2[i]);
        }
        System.out.println(hash2);
        for(int i:hash1){
           if(!hash2.contains(i)){
            arr1.add(i);
           }
        }
        for(int i: hash2){
            if(!hash1.contains(i)){
             arr2.add(i);
            }
         }

        arr.add(arr1);
        arr.add(arr2);

        System.out.println(arr);
        System.out.println(arr2);

    }
}