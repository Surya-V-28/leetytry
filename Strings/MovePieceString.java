
public class MovePieceString {

    public static void main(String args[]) {

        String start = "_L__R__R_";
        String target = "L______RR";

        if (start.equals(target)) {
            System.out.println("Answer is correct for the codde");
        }
        int waitL = 0;
        int waitR = 0;

        for (int i = 0; i < start.length(); i++) {
            char startS = start.charAt(i);
            char goal = target.charAt(i);

            if (startS == 'R') {
                if (waitL > 0) {
                    System.err.println("False");
                    break;
                }
                waitR++;
            }
            if (goal == 'L') {
                if (waitL > 0) {
                    System.out.print("False");
                    break;
                }
                waitL++;
            }

            if (goal == 'R') {
                if (waitR == 0) {
                    System.out.println("False");
                    break;
                }
                waitR--;
            }
            if (startS == 'L') {
                if (waitL == 0) {
                    System.out.println("False");
                    break;
                }
                waitL--;
            }

        }

        if (waitL == 0 && waitR == 0) {
            System.out.println("True");
        }

    }
}
