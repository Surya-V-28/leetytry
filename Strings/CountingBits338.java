


import java.util.*;


public class CountingBits338 {
    public static void main(String args[]){
        System.out.println("Working");
        int num = 5;
        CountingBits338Ways.usingBooleanMethod(num);
        
    }
}


class CountingBits338Ways {
    static void usingBooleanMethod(int n){
        int[] arrs = new int[n+1];
        for(int i=0;i<n+1;i++){
            int count = 0, num = i;
            while(num>0){
                num = num & (num-1);
                System.out.println(num);
                count++;
            }
            arrs[i]=count;
        }
        StringHelper.arrayPrinter(arrs);

    }

    static void burteForce(int num){
        int  count;
        int[] arrs = new int[num+1];
        for(int i=0;i<num+1;i++){
            String bit  = Integer.toBinaryString(i);
            count = 0;
            for(int j=0;j<bit.length();j++){
                if(bit.charAt(j)=='1'){
                    count++;
                }
            }
            arrs[i] = count;
        }
        StringHelper.arrayPrinter(arrs);
    }
}