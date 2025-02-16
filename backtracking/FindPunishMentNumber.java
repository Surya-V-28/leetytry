
public class FindPunishMentNumber {

    public boolean isTotal(int n, int currSub, String sqrt) {
        if (currSub == n && sqrt.isEmpty()) {
            return true;
        }
        if (currSub > n) {
            return false;
        }
        for (int i = 0; i < sqrt.length(); i++) {
            String left = sqrt.substring(0, i + 1);
            String right = sqrt.substring(i + 1);
            if (isTotal(n, currSub + Integer.parseInt(left), right)) {
                return true;
            }
        }
        return false;
    }

    public int punishmentNumber(int n) {
        int ans = 1;
        if (n < 9) {
            return ans;
        }
        for (int i = 9; i <= n; i++) {
            if (isTotal(i, 0, String.valueOf(i * i))) {
                ans += i * i;
            }
        }
        return ans;
    }
}
