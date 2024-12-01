
import java.util.*;

public class BFS {

    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] already = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        already[0] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            bfs.add(node);

            for (int i : adj.get(node)) {
                if (already[i] == false) {
                    queue.add(i);
                    already[i] = true;
                }
            }
        }

        return bfs;
    }
}
