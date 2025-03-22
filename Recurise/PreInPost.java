
public class PreInPost {

    public static void callBackTrack(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(" Pre " + n);
        callBackTrack(n - 1);
        System.out.println(" in " + n);
        callBackTrack(n - 1);
        System.out.println(" Post " + n);
    }

    public static void main(String[] args) {
        System.out.println("Working on the code");
        int n = 5;
        callBackTrack(n);
    }
}
