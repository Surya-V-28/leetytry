
class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= pref.length() && pref.equals(words[i].substring(0, pref.length()))) {
                ans++;
            }
        }
        return ans;

    }
}
