
public class CountVowelStringsinRanges {

    public static void main(String[] args) {
        System.out.println("this is the surya here you can see it");
        String[] words = {"aba", "bcb", "ece", "aa", "e"};
        int count = 0;
        int[] vCounts = new int[words.length];
        int[] preSum = new int[words.length];
        int arrfiller = 0;
        int[][] queries = {
            {0, 2},
            {1, 4},
            {1, 1}
        };
        for (int i = 0; i < words.length; i++) {
            count = 0;
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                vCounts[i] = 1;
            } else {
                vCounts[i] = 0;
            }

        }
        preSum[0] = vCounts[0];
        for (int i = 1; i < vCounts.length; i++) {
            preSum[i] = preSum[i - 1] + vCounts[i];
            System.err.print(vCounts[i] + " , ");
        }
        System.out.println("the preSum array is here");
        for (int i = 0; i < preSum.length; i++) {
            System.err.print(preSum[i] + " , ");
        }
        System.out.println("");
        System.out.println("the final answer is here");
        for (int[] elem : queries) {
            int ans = (elem[0] == 0) ? preSum[elem[1]] : preSum[elem[1]] - preSum[elem[0] - 1];
            System.out.print(ans + ", ");
        }
    }
    // import java.util.Arrays;
// // public class VowelStringQuery {
//     public static void main(String[] args) {
//         // Input data
//         String[] words = {"aba", "bcb", "ece", "aa", "e"};
//         int[][] queries = {
//             {0, 2},
//             {1, 4},
//             {1, 1}
//         };

//         // Call the function and print results
//         int[] result = vowelStringsInRanges(words, queries);
//         System.out.println("Result: " + Arrays.toString(result));
//     }
//     public static int[] vowelStringsInRanges(String[] words, int[][] queries) {
//         int n = words.length;
//         int[] vowelCount = new int[n];
//         int[] prefixSum = new int[n];
//         // Step 1: Precompute whether each word starts and ends with a vowel
//         for (int i = 0; i < n; i++) {
//             if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
//                 vowelCount[i] = 1;
//             } else {
//                 vowelCount[i] = 0;
//             }
//         }
//         // Step 2: Create the prefix sum array
//         prefixSum[0] = vowelCount[0];
//         for (int i = 1; i < n; i++) {
//             prefixSum[i] = prefixSum[i - 1] + vowelCount[i];
//         }
//         // Step 3: Process each query
//         int[] ans = new int[queries.length];
//         for (int i = 0; i < queries.length; i++) {
//             int li = queries[i][0];
//             int ri = queries[i][1];
//             if (li == 0) {
//                 ans[i] = prefixSum[ri];
//             } else {
//                 ans[i] = prefixSum[ri] - prefixSum[li - 1];
//             }
//         }
//         return ans;
//     }
    // Helper method to check if a character is a vowel
    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

}
