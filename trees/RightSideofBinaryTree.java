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
    List<Integer> arr = new ArrayList<>();
   public void InOrder(TreeNode node,int level){
       if(node==null) return;
       if(level == arr.size()){
        arr.add(node.val);
       }
       InOrder(node.right,level+1);
       InOrder(node.left,level+1);
   }
   public List<Integer> rightSideView(TreeNode root) {
       InOrder(root,0);
       return  arr;
   }
}

