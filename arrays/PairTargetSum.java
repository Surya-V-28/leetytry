
import java.util.*;

public class PairTargetSum {
     static boolean prime[];
    public static void primesfind(int num){
        prime = new boolean[num+1];
      
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (prime[i]) {
                for (int j = i * i; j <= num; j += i) {
                    prime[j] = false;
                }
            }
        }
        System.out.println(Arrays.toString(prime));


    }
    public static void main(String args[]) {
        System.out.println("Working");
        List<List<Integer>> ls=  new ArrayList<>();
        primesfind(10); //
        int n=10;
        for(int x=1;x<=n/2;x++){
            int y = n-x;
            if(prime[x] && prime[y]){
                ls.add(List.of(x,y));

            }
        }

        System.out.println(ls);
        

      

    }


}