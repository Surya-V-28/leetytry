
// import java..Array;
import java.util.*;

public class ReorderRoutes {

    public static int dfs(int currentNode, int n, int[][] connections, ArrayList<ArrayList<Integer>> ls, boolean[] visited, int result) {

        if (visited[currentNode]) {
            return result;
        }
        visited[currentNode] = true;

        for (int a : ls.get(currentNode)) {
            if (!visited[Math.abs(a)]) {
                if (a > 0) {
                    result++;
                }
                result = dfs(Math.abs(a), n, connections, ls, visited, result);
            }

        }
        return result;
    }

    public static void main(String args[]) {
        int n = 6;
        int[][] connections = {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};

        //Creating the adjaceny List
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ls.add(new ArrayList<Integer>());

        }
        boolean[] visited = new boolean[n];

        // make the graph as bidirectional 
        for (int[] c : connections) {
            ls.get(c[0]).add(c[1]);
            ls.get(c[1]).add(-c[0]);
        }

        // call the defs functions
        System.err.println(dfs(0, n, connections, ls, visited, 0));

    }
}
