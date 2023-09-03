

import java.util.*;


public class  duplicateElement217 { 
    public static void main(String args[]) {
        Helper helps = new Helper();
        int[] arrs  = {1,2,3,4,5,1};
        helps.bruteforce(arrs);
        helps.hashmapSolved(arrs);
        helps.betterapprochHash(arrs);
}
}

class Helper {
    int[] arrayGetter() {
        System.out.println("enter the the size of the array");
        Scanner scans  = new Scanner( System.in);
        int number = scans.nextInt();
        int[] arrs = new int[number];
        for(int j=0;j<number;j++){
            arrs[j] = scans.nextInt();
        }
        return arrs;
    }

    void arrayPrinter(int[] arrs) {
        
        System.out.println("the is the output of the array");
        for(int j=0;j<arrs.length;j++){
            System.out.print("" + arrs[j]+ " ");
        }
    }
    void helperPrinter() {
        System.out.println("this is the printer functions of the classs");
    }


    void bruteforce(int arrs[]){
        boolean flag= false;
        for(int i=0;i<arrs.length;i++){
            for(int j=0;j<arrs.length;j++){
                if(arrs[i]==arrs[j]){
                    System.out.println("True");
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        if(!flag){
            System.out.println("False");
        }
    }

    void hashmapSolved(int arrs[]){
        HashMap<Integer,Integer> hash = new HashMap<>();
        int count = 0;
        for(int j=0;j<arrs.length;j++){
            hash.put(arrs[j],count++);
        }
        if(hash.size()==arrs.length){
            System.out.println("False");
        }else {
            System.out.println("True");
        }
    }


    void betterapprochHash(int[] arrs) {
        HashMap<Integer,Integer> nums = new HashMap<>();
        boolean flag = false;
        for(int i=0;i<arrs.length;i++){
            if(nums.containsKey(arrs[i])){
                 System.out.println("True");
                 flag =true;
            }
            else {
                nums.put(arrs[i],nums.getOrDefault(arrs[i], 0) + 1);
            }
        }
        if(!flag){
        System.out.print("False");
        }
    }
    
}