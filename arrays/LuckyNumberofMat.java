

import java.util.*;


public class LuckyNumberofMat {
    public static void main(String args[]){
        System.out.println("wORKINGS");
        int currMin = Integer.MAX_VALUE;
        int currMax = Integer.MIN_VALUE;

        int[][] matrix = {{3,7,8,8},{9,11,13,12},{15,16,17,15}};
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            currMin = Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                currMin = Math.min(currMin,matrix[i][j]);
               
            }
            list1.add(currMin);
        }

        for(int i=0;i<matrix[0].length;i++){
            currMax = Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                currMin = Math.max(currMax,matrix[j][i]);
            }
           list2.add(currMin);
        }
       
       list1.retainAll(list2);
       System.out.println(list1);


    }
    }