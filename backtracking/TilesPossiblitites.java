
import java.util.*;

public class TilesPossiblitites {

    public void backtack(String s, int start, ArrayList<String> arr, StringBuilder currS, int pos, HashMap<Character, Integer> hash) {
        if (pos <= s.length() & !currS.isEmpty()) {
            arr.add(currS.toString()); // Fix: Convert StringBuilder to String before adding
        }

        for (int i = 0; i < s.length(); i++) {
            if (hash.get(s.charAt(i)) > 0) {
                currS.append(s.charAt(i));
                hash.put(s.charAt(i), hash.get(s.charAt(i)) - 1);
                System.out.println("print Curr " + currS);
                backtack(s, i, arr, currS, pos + 1, hash);
                currS.deleteCharAt(currS.length() - 1);
                hash.put(s.charAt(i), hash.get(s.charAt(i)) + 1);
            }
        }
    }

    public ArrayList<String> numTilePossibilities(String tiles) {
        ArrayList<String> arr = new ArrayList<>();
        HashMap<Character, Integer> hash = new HashMap<>();
        for (char elem : tiles.toCharArray()) {
            hash.put(elem, hash.getOrDefault(elem, 0) + 1);
        }
        backtack(tiles, 0, arr, new StringBuilder(), 0, hash); // Fix: Use new StringBuilder()

        return arr;
    }

    public static void main(String[] args) {
        TilesPossiblitites sol = new TilesPossiblitites();
        String tiles = "AAB";
        ArrayList<String> result = sol.numTilePossibilities(tiles);
        HashSet<String> sets = new HashSet<>(result);
        System.out.println("Possible sequences count: " + result);
        System.out.println("Possible sequences Sets: " + sets);
    }
}
