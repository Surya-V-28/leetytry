public class LargestCommmonPrefix {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String[] inputs = { "dog", "racecar", "car" };
        String finalsAnswer = "";
        char checkChar;
        boolean same = true, overall = true;
        for (int i = 0; overall; i++) {
            checkChar = '9';
            for (int j = 0; j < inputs.length; j++) {
                System.out.println("This Enter the Loop J = " + j);
                if (inputs[j].length() - 1 == i) {
                    System.out.println("tHE length " + (inputs[j].length() - 1) + "== " + i);
                    overall = false;
                    break;
                }
                if (checkChar == '9') {
                    checkChar = inputs[j].charAt(i);
                    j++;

                } else if (checkChar != (inputs[j].charAt(i))) {
                    same = false;
                    System.out.println(checkChar + "!=" + inputs[j].charAt(i));
                } else if (checkChar == (inputs[j].charAt(i))) {
                    System.out.println(checkChar + "==" + inputs[j].charAt(i));
                } else {
                    System.out.println("Some this Happens");
                }

            }
            if (same) {
                finalsAnswer = finalsAnswer + checkChar;
                System.out.println("All thee value are common" + finalsAnswer);
            }

        }
        System.out.println(finalsAnswer + " This is Final Answer");

    }

}
