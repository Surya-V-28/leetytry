

// The problem is asking you to find pairs of cities (A, B) in a tree, where:

// The subtree rooted at city A contains exactly x cities.
// The subtree rooted at city B contains exactly y cities.
// Key Concepts:
// A subtree rooted at city A includes A itself and all its descendants (other cities connected beneath A in the tree).
// For each city A, the size of its subtree is the number of cities (nodes) in that subtree, including itself.
// Example Breakdown:
// Input:
// n = 8 (8 cities)
// edges = [[1,2], [1,3], [2,4], [2,5], [3,6], [6,7], [5,8]] (tree connections)
// x = 3 (City A's subtree has 3 cities)
// y = 2 (City B's subtree has 2 cities)
// Tree Structure:
// The edges form a tree rooted at city 1:
// markdown
// Copy code
//       1
//      / \
//     2   3
//    / \    \
//   4   5    6
//        \     \
//         8     7
// Subtree Sizes:
// Each city's subtree includes itself and all its descendants:
// City 1's subtree: 8 cities (all cities)
// City 2's subtree: 4 cities (2, 4, 5, 8)
// City 3's subtree: 3 cities (3, 6, 7)
// City 4's subtree: 1 city (just 4)
// City 5's subtree: 2 cities (5, 8)
// City 6's subtree: 2 cities (6, 7)
// City 7's subtree: 1 city (just 7)
// City 8's subtree: 1 city (just 8)
// What They Want:
// Find pairs of cities (A, B) where:
// Subtree of A has 3 cities (like city 3).
// Subtree of B has 2 cities (like cities 5 or 6).
// Valid Pairs in Example:
// A = 3 (subtree size = 3), B = 5 (subtree size = 2)
// A = 3 (subtree size = 3), B = 6 (subtree size = 2)
// So, there are 2 valid pairs, and the output is 2.

// What You Need to Do:
// Calculate the size of the subtree for each city.
// Count how many cities have subtree size x and how many have subtree size y.
// Multiply the counts to get the total number of pairs (A, B).








class Solution {
    
    static int[] subtreeSize; // To store the size of the subtree for each node
    static List<Integer>[] tree; // Adjacency list representation of the tree

    // DFS function to calculate subtree sizes
    public static int dfs(int node, int parent) {
        int size = 1; // Start with size 1 for the node itself
        
        // Recur for all children
        for (int child : tree[node]) {
            if (child != parent) { // Avoid going back to the parent
                size += dfs(child, node); // Add child's subtree size
            }
        }
        
        // Store the subtree size for the current node
        subtreeSize[node] = size;
        return size;
    }

    public static long getCount(int n, int[][] edges, int x, int y) {
        // Initialize the tree and subtree size array
        tree = new ArrayList[n + 1]; // 1-based indexing
        subtreeSize = new int[n + 1];
        // Create the adjacency list for the tree
        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            tree[u].add(v);
            tree[v].add(u);
        }
        
        // Perform DFS to calculate subtree sizes
        dfs(1, -1); // Start from the root node (1)

        // Count the number of nodes with subtree size x and y
        int countX = 0, countY = 0;
        for (int i = 1; i <= n; i++) {
            if (subtreeSize[i] == x) countX++;
            if (subtreeSize[i] == y) countY++;
        }

        // The number of valid pairs is countX * countY
        return (long) countX * countY;
    }
}