
class RotateString {

    public boolean rotateStringOptimal(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            String crr = s.substring(i + 1, s.length()) + s.substring(0, i + 1);
            if (goal.equals(crr)) {
                return true;
            }
        }
        return false;
    }
}
