import java.util.Arrays;

public class LargestCommonPrefixGivenSolution {

    public static void main(String[] args) {
        String[] inputs = { "dog", "racecar", "car" };
        Arrays.sort(inputs);
        System.out.print(inputs);
        String SmallestString = inputs[0];
        String LargestString = inputs[inputs.length - 1];
        System.out.println("the largest String" + LargestString + "The Samllest String" + SmallestString);
        int idx = 0;
        while (idx < SmallestString.length() && idx < LargestString.length()) {
            if (SmallestString.charAt(idx) == LargestString.charAt(idx)) {
                idx++;
            } else {
                break;
            }

        }
        System.out.print("Thiss is the final Answer");
        System.out.println(SmallestString.substring(0, idx) + "the answer");
    }

}
