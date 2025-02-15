
class Solution {

    public int findLHS(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int n : nums) {
            hash.put(n, hash.getOrDefault(n, 0) + 1);
        }
        for (int key : hash.keySet()) {
            if (hash.containsKey(key + 1)) {
                ans = Math.max(ans, hash.get(key) + hash.get(key + 1));
            }
        }
        return ans;
    }
}
