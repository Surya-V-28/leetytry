
import java.util.*;
public class BuyandSell {
    public static void main(String[] args) {
        System.out.println("Welcome to Buy and Sell program!");
       int[] prices = {7,1,5,3,6,4};
       int fee = 2;

       System.out.print(recuirse(0,1,prices.length,prices));

    }

    public static int recuirse(int ind, int buy, int n, int[] arr){
        if(ind==n) return 0;
     
        int profit = 0;
        if(buy==1){
            int buys = -arr[ind] + recuirse(ind+1,0,n,arr);
            int skip =  0+ recuirse(ind+1,1,n,arr);
             profit = Math.max(buys,skip);
        }
        else {
             int  sell = arr[ind] + recuirse(ind+1,1,n,arr);
            int skip =  0+ recuirse(ind+1,0,n,arr);
            profit = Math.max(sell,skip);
            
        }
        return profit;
    }
}
