



import java.util.*;


public class SameRowNColumn {
    public static void main(String args[]){
        System.out.println("Wokring66");
        int[][] arrs = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        int count =0;
        HashMap<String,Integer> hashRow = new HashMap<>();
        HashMap<String, Integer> hashColumn = new HashMap<>();
        StringBuilder row = new StringBuilder("");
        for(int i=0;i<arrs.length;i++){
            for(int j=0;j<arrs[0].length;j++){
                row.append("-"+arrs[i][j]);
            }
            row.delete(0,1);
            System.out.println(row);
            hashRow.put(row.toString(),hashRow.getOrDefault(row.toString(),0)+1);
            row.delete(0,row.length());
            
        }

        int[][] arrn = Transpose(arrs);

        for(int i=0;i<arrn.length;i++){
            for(int j=0;j<arrn[0].length;j++){
                row.append("-"+arrn[i][j]);
            }
            row.delete(0,1);
            hashColumn.put(row.toString(),hashColumn.getOrDefault(row.toString(),0)+1);
            row.delete(0,row.length());
        }
        System.out.println(hashRow);
        System.out.println(hashColumn);
        for(String s:hashRow.keySet()){
            if(hashColumn.containsKey(s)){
                count +=hashColumn.get(s)*hashRow.get(s);
            }
        }
        System.out.println(count);

    }
    public static int[][] Transpose(int[][] arrays){
        int row  =arrays.length;
        int columns = arrays[0].length; 
        int[][] arrsN = new int[columns][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                arrsN[j][i] = arrays[i][j];
            }
        }
        return arrsN;
    }
}