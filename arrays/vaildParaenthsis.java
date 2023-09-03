import java.util.HashMap;
import java.util.Stack;

public class vaildParaenthsis {

    public static void main(String[] args) {

        String GiveInputs = "[}([()])]";

        Stack<Character> stk = new Stack<>();
        HashMap<Character, Character> hash = new HashMap<>();
        hash.put(')', '(');
        hash.put('}', '{');
        hash.put(']', '[');

        for (int i = 0; i < GiveInputs.length(); i++) {
            switch (GiveInputs.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    stk.push(GiveInputs.charAt(i));
                    break;
                case '}':
                case ']':
                case ')':
                    if (stk.isEmpty() || stk.pop() != hash.get(GiveInputs.charAt(i))) {
                        System.out.println(stk);
                    }
                    break;
            }

        }

    }
}
