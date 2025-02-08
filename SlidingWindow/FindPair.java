
import java.util.*;

public class FindPair {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the number of rows
        // int N = scanner.nextInt();
        int N = 5;
        int[][] arr  = {
            {1,2,4,5,6},
            {7,5,3,2,6},
            {0,0,0,0,0},
            {7,1,3,4,7},
            {0,0,0,0,0}
        };
        int j=0;
        int ans1 = 0;

      ArrayList<ArrayList<Integer>> arrs = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int sum=0;
            ArrayList<Integer> ans = new ArrayList<>();
            while(j<i+2 && i < arr.length-i){
                ans.add(arr[i][j]);
                ans.add(arr[i+2][j]);
                j++;
            }
            ans.add(arr[(i+j)/2][(i+j)/2]);
            j=i;
            arrs.add(ans);
        }
        j=0;
        System.out.print(arrs);
    }

    
}
