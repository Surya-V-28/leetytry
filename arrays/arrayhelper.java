

import java.util.*;
public class arrayhelper {
    static void arrayPrinter(int[] arrs) {
        
        System.out.println(" output:array ");
        for(int j=0;j<arrs.length;j++){
            System.out.print("" + arrs[j]+ " ");
        }
    }
    static void arrayPrinter2d(int[][] arrs) {
        
        System.out.println(" output:array ");
        for (int[] row : arrs) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}