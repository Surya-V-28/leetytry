import java.util.*;

public class DefuseTheBomb {

    public static void main(String[] args) {
        System.out.println("Working");
        int[] code = {2, 4, 9, 3};
        int k = -2;
        int sum;
        int[] ans = new int[code.length];

        for (int i = 0; i < code.length; i++) {
            sum = 0;

            if (k > 0) {
                // Add k elements clockwise
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % code.length];
                }
                ans[i] = sum;

            } else if (k == 0) {
                // No operations needed when k == 0
                ans[i] = 0;

            } else {
                // Add k elements counter-clockwise
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + code.length) % code.length];
                }
                ans[i] = sum;
            }
        }

        // Print the resulting array
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
