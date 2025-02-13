
import java.util.*;

public class AssignElementToGroups {

    public static int[] assignElements(int[] groups, int[] elements) {
        int n = groups.length, m = elements.length;
        int[] result = new int[n];

        // Step 1: Store the smallest index of each element in a HashMap
        Map<Integer, Integer> minIndex = new HashMap<>();
        for (int j = 0; j < m; j++) {
            minIndex.putIfAbsent(elements[j], j); // Store first occurrence (smallest index)
        }

        // Step 2: Process each group efficiently
        for (int i = 0; i < n; i++) {
            int g = groups[i];
            int bestIndex = -1;

            // Check divisors of g (O(√g))
            for (int d = 1; d * d <= g; d++) {
                if (g % d == 0) {
                    // Check divisor 'd'
                    if (minIndex.containsKey(d)) {
                        if (bestIndex == -1 || minIndex.get(d) < bestIndex) {
                            bestIndex = minIndex.get(d);
                        }
                    }
                    // Check paired divisor 'g/d' (if it's different)
                    int pairDivisor = g / d;
                    if (pairDivisor != d && minIndex.containsKey(pairDivisor)) {
                        if (bestIndex == -1 || minIndex.get(pairDivisor) < bestIndex) {
                            bestIndex = minIndex.get(pairDivisor);
                        }
                    }
                }
            }

            result[i] = bestIndex; // Assign best element index or -1
        }
        return result;
    }

    public static void main(String[] args) {
        int[] groups = {8, 4, 3, 2, 4};
        int[] elements = {4, 2};
        System.out.println(Arrays.toString(assignElements(groups, elements))); // Output: [0, 0, -1, 1, 0]
    }
}
