import java.util.Stack;
import java.util.HashMap;

public class RomanInteger {

    public static void main(String args[]) {
        int count = 0, i, elmentLast = 1;
        Stack<Character> stk = new Stack<>();
        HashMap<Character, Integer> hash = new HashMap<>();
        hash.put('I', 1);
        hash.put('V', 5);
        hash.put('X', 10);
        hash.put('L', 50);
        hash.put('C', 100);
        hash.put('D', 500);
        hash.put('M', 1000);
        String inputs = "MCMXCIV";
        System.out.println("The Given VALUE " + hash.get('D'));
        for (i = 0; i < inputs.length() - 1; i++) {
            stk.push(inputs.charAt(i));
            if (hash.get(stk.peek()) < hash.get(inputs.charAt(i + 1))) {
                count = hash.get(inputs.charAt(1 + i)) - hash.get(stk.peek()) + count;
                stk.pop();
                if (i == inputs.length() - 2) {
                    elmentLast = 0;
                    i = i - 1;
                    break;
                } else {
                    elmentLast = 1;
                    i = i + 1;
                }

            }

        }
        if (elmentLast == 1) {
            stk.push(inputs.charAt(i));
        }

        while (stk.size() != 0) {
            count = count + hash.get(stk.pop());
        }

        System.out.println(count);
    }
}
