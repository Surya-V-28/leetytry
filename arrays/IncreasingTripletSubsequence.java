


import java.util.*;


public class IncreasingTripletSubsequence {
    public  static void main(String args[]){
        System.out.println("Wokring");
        int[] nums = {1,2,3,4,5};
        int ans = 3;
        ArrayList<Integer[]> arrays = new  ArrayList<Integer[]>();

    }

    void Backtracking(int index,NoOfDigits, int[] previousCombination , ArrayList<Integer[]> result) {
        if(index >= 3){
            return ;
        }

        for(int i=0;i<4;i++){
            int[] newCombination =  previousCombination.clone();
            newCombination[index] = i;
            if(index==2){
                if(CheckCondition(newCombination)){
                    System.out.println("True ");
                    break;
                }
            }
        }
    }
}