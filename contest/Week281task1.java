
import java.util.*;

public  class Week281task1 {
     
    public static void main(String args[]) {
    int[][] ans = {
        {1, 2, 1, 2},
    {5, 5, 5, 5},
    {6, 3, 6, 3}
    };
    int k=1;
    System.out.println(ans[0].length);
    int[][] newmatrix = new int[ans.length][ans[0].length];
   ArrayList<Integer> arr = new ArrayList<>();
   ArrayList<ArrayList<Integer>> arrfull = new ArrayList<ArrayList<Integer>>();
    // Right Shift 
    for(int j=0;j<ans.length;j++)
    {
       
        for(int i=0;i<ans[0].length;i++)
        {
             arr.add(ans[j][i]); 
             if(i==ans[0].length-1){
                ShiftArrayForGivenTimes(arr,k,arrfull);
                arrfull.add(arr);
                arr.clear();
                break;
             }
        }
        System.out.println(arr);
        
    }
    //ShiftArrayForGivenLeft(arr,k);
    
    
   // printMatrix(ans);
}
  public static void ShiftArrayForGivenTimes(ArrayList<Integer> list, int k, ArrayList<ArrayList<Integer>> arrfull){
    int size = list.size();
        // If k is greater than the size of the list, adjust it
        k = k % size;
        Collections.rotate(list, k);
       // ArrayList<Integer> temp = list;
       arrfull.add(list);
       System.out.println(arrfull);
       
  }
   
  public static void  ShiftArrayForGivenLeft(ArrayList<Integer> list, int k){
    int size = list.size();
        // If k is greater than the size of the list, adjust it
        k = k % size;
        Collections.rotate(list, -k);
  }

public static void printMatrix(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println(); // Move to the next line after printing each row
    }
}


}