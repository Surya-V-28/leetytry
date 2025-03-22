
public class PascalTraingle {

    public static void main(String args[]) {
        System.out.println("Working on the code");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int ans = 1;
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            // System.out.print(1);
            for (int j = 1; j < i; j++) {
                ans = ans * (i - j);
                System.out.println();
                System.out.println(" The cahing part " + ans + " ans / j " + j);
                ans /= j;
                System.out.print(" " + ans);
            }
            System.out.println("");

        }
    }
}
