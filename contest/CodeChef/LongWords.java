
import java.util.*;

public class LongWords {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String get = sc.nextLine();
            if (get.length() > 10) {
                String ne = "" + get.charAt(0) + (get.length() - 2) + get.charAt(get.length() - 1) + "";
                System.out.println(ne);
            } else {
                System.out.println(get);
            }

        }
    }
}
