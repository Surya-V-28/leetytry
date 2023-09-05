



import java.util.*;
public class StringHelper {
    static void StringPrinter(char[] arrs) {
        
        System.out.println(" output:String ");
        for(int j=0;j<arrs.length;j++){
            System.out.print("" + arrs[j]+ " ");
        }
    }

    static void StringPrinterS(String[] arrs) {
        
        System.out.println(" output:String ");
        for(int j=0;j<arrs.length;j++){
            System.out.println("" + arrs[j]+ "");
        }
    }

    static void arrayPrinter(int[] arrs) {
        
        System.out.println(" output:array ");
        for(int j=0;j<arrs.length;j++){
            System.out.print("" + arrs[j]+ " ");
        }
    }
    
}