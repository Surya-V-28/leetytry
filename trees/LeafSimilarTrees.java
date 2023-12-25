

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
       List<Integer> LValues  = new ArrayList<Integer>();
       List<Integer> RValues = new ArrayList<Integer>();
       PreOrder(root1,LValues);
       PreOrderR(root2,RValues);
       
       return LValues.equals(RValues);

    }

    public static void PreOrder(TreeNode root, List<Integer> Values){
        if(root==null){
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.println(root.val);
            Values.add(root.val);
        }
        PreOrder(root.left,   Values);
        PreOrder(root.right,  Values);
    }
    public static void PreOrderR(TreeNode root, List<Integer> Values){
        if(root==null){
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.println(root.val);
            Values.add(root.val);
        }
        PreOrderR(root.left,Values);
        PreOrderR(root.right,Values);
    }
}