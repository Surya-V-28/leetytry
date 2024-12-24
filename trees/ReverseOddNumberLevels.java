
import java.util.*;

public class ReverseOddNumberLevels {

    public static void main(String[] args) {

        System.out.println("Woprking");

    }
}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {

    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean isOddLevel = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode[] levelNodes = new TreeNode[size];
            int index = 0;

            // Collect nodes at the current level and add their children to the queue
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                levelNodes[index++] = current;

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            // Reverse values for odd levels
            if (isOddLevel) {
                int left = 0, right = levelNodes.length - 1;
                while (left < right) {
                    int temp = levelNodes[left].val;
                    levelNodes[left].val = levelNodes[right].val;
                    levelNodes[right].val = temp;
                    left++;
                    right--;
                }
            }

            isOddLevel = !isOddLevel;
        }

        return root;
    }
}
