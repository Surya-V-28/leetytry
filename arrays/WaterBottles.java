

import java.util.*;


public class WaterBottles {
    public static void main(String[] args) {
        System.out.println("Working");
        int numBottles = 9, numExchange = 3;
        int ans = numBottles;
        int bal =numBottles;
        int numtoadd= 0;
        while(bal>=numExchange){
            numtoadd  = bal/numExchange;
            bal =  bal/numExchange;
            int remainder = bal%numExchange;
            bal = bal + remainder;
            System.out.println(numtoadd);
            System.out.println(bal);
            ans = ans + (bal/numExchange)+numtoadd;
        }
        System.out.println(ans);
        System.out.println(bal);

    }
}