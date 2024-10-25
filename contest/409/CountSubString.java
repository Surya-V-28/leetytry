class Solution {
    public static int countSubstrings(String s, int k) {
     int n = s.length();
     int totalCount = 0;
     HashMap<Character, Integer> frequencyMap = new HashMap<>();
     int left = 0;
     for (int right = 0; right < n; right++) {
         frequencyMap.put(s.charAt(right), frequencyMap.getOrDefault(s.charAt(right), 0) + 1);
         while (containsAtLeastK(frequencyMap, k)) {
             totalCount += (n - right); 
             char leftChar = s.charAt(left);
             frequencyMap.put(leftChar, frequencyMap.get(leftChar) - 1);
             if (frequencyMap.get(leftChar) == 0) {
                 frequencyMap.remove(leftChar);
             }
             left++;
         }
     }
     return totalCount;
 }

 private static boolean containsAtLeastK(HashMap<Character, Integer> frequencyMap, int k) {
     for (int count : frequencyMap.values()) {
         if (count >= k) {
             return true; 
         }
     }
     return false;
 }
 
 public int numberOfSubstrings(String s, int k) {
        int totalCount = countSubstrings(s, k);
     return totalCount;
     
 }
}

