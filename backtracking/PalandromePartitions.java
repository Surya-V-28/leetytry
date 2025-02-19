
class Solution {

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        helper(s, 0, ans, ds);
        return ans;
    }

    public void helper(String s, int i, List<List<String>> ans, List<String> ds) {
        if (i == s.length()) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int id = i; id < s.length(); id++) {
            if (pallindrome(s, i, id)) {
                ds.add(s.substring(i, id + 1));
                helper(s, id + 1, ans, ds);
                ds.remove(ds.size() - 1);
            }
        }
    }

    public boolean pallindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
}
