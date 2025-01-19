
public class ShiftingSum {

    String bruteForce() {
        int[][] shifts = {{0, 1, 1}};
        String s = "abc";
        int[] shiftTotal = new int[s.length()];
        for (int[] arr : shifts) {
            if (arr[2] == 1) {
                for (int i = arr[0]; i <= arr[1]; i++) {
                    shiftTotal[i] = shiftTotal[i] + 1;
                }
            } else {
                for (int i = arr[0]; i <= arr[1]; i++) {
                    shiftTotal[i] = shiftTotal[i] - 1;
                }
            }
        }
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < shiftTotal.length; i++) {
            char ch = (char) (((((int) s.charAt(i) - 'a') + shiftTotal[i]) % 26 + 26) % 26 + (int) 'a');

            str.append(ch);
        }

        return str.toString();

    }

    public static void main(String args[]) {
        System.out.print("Working the data and answers");

    }
}
