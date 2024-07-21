
import java.util.ArrayList;
import java.util.List;

public class NumberOfIsland {

    public static void dfs(int node, boolean[] already,List<List<Integer>> adjacencyList ){
        already[node] = true;

        for(int i:adjacencyList.get(node)){
            if(already[i]==false){
                dfs(i,already,adjacencyList);
            }
        }

    }
    public static void main(String[] args) {
        // Example adjacency matrix
        char[][] adjacencyMatrix = {
            {'1', '1', '1', '1', '0'},
    {'1', '1', '0', '1', '0'},
    {'1', '1', '0', '0', '0'},
    {'0', '0', '0', '0', '0'}
        };

        // Convert to adjacency list
        List<List<Integer>> adjacencyList = convertToAdjacencyList(adjacencyMatrix);

        // Print the adjacency list
        printAdjacencyList(adjacencyList);
        int lengs = adjacencyList.size();
        boolean[] already = new boolean[lengs];
        int ans =0;
        for(int i=0;i<lengs;i++){
            if(already[i]==false){
                ans++;
                dfs(i,already,adjacencyList);
            }
        }
        System.out.println(ans);

    }


    public static List<List<Integer>> convertToAdjacencyList(char[][] adjacencyMatrix) {
        int n = adjacencyMatrix.length;
        List<List<Integer>> adjacencyList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                if (i != j && adjacencyMatrix[i][j] != '0') {
                    adjacencyList.get(i).add(j);
                }
            }
        }

        return adjacencyList;
    }

    public static void printAdjacencyList(List<List<Integer>> adjacencyList) {
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.print(i + ": ");
            for (int neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
