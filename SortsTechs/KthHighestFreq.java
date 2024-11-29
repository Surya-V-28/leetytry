import java.util.*;

public class KthHighestFreq {
    public static void main(String[] args) {
        System.out.println("Working");
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        Map<Integer, Integer> hash = new HashMap<>();
        
        // Count frequencies
        for (int a : nums) {
            hash.put(a, hash.getOrDefault(a, 0) + 1);
        }
        
        // Find the maximum frequency
        int maxFreq = Collections.max(hash.values());
        
        // Create a list of lists for frequencies
        List<Integer>[] ls = new List[maxFreq + 1];
        for (int i = 0; i <= maxFreq; i++) {
            ls[i] = new ArrayList<>();
        }
        
        // Populate the lists
        for (int key : hash.keySet()) {
            int freq = hash.get(key);
            ls[freq].add(key);
        }
        
        // Collect the top k frequent elements
        List<Integer> result = new ArrayList<>();
        for (int i = maxFreq; i >= 0 && result.size() < k; i--) {
            if (ls[i] != null) {
                result.addAll(ls[i]);
            }
        }
        
        // Print results
        for (int i = 0; i < k && i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}



// 9why the the the tproblem is  not  wrking at the time of the coding 