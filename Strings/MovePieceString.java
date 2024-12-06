
public class MovePieceString {

    public static String leftShift(int index, String start, int indextobePlaced) {

        for (int i = index; i < start.length(); i++) {
            if (start.charAt(i) == 'R') {
                System.out.println("Errors");
                break;
            } else if (start.charAt(i) == 'L') {
                int j = i;

                while (j > 0 && start.charAt(j - 1) == '_') {
                    if (j == indextobePlaced) {
                        break;
                    }
                    System.out.println("Swap between the j " + j + " and  j1 " + ((int) j - 1));
                    j--;
                }

            }
        }
        return start;
    }

    public static String RightShift(int index, String start, int indextobePlaced) {

        for (int i = index; i < start.length(); i++) {
            if (start.charAt(index) == 'L') {
                System.out.println("Errors in the Right Block");
                break;
            }
        }
        return start;
    }

    public static void main(String args[]) {

        String start = "_L__R__R_";
        String target = "L______RR";
        int stPointer = 0;

        for (int i = 0; i < target.length(); i++) {
            if (start.charAt(stPointer) == target.charAt(i)) {
                stPointer++;
            } else if (target.charAt(i) == 'L') {
                leftShift(stPointer, start, i);
                break;
            } else {
                RightShift(stPointer, start, i);
                break;

            }

        }

    }
}
