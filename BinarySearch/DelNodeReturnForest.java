

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
    public TreeNode preOrder(TreeNode root, Set<Integer> Delete ,List<TreeNode> result){
        if(root==null) return null;
       root.left = preOrder(root.left,Delete, result);
       root.right = preOrder(root.right,Delete,result);
        if(Delete.contains(root.val)){
            if(root.left!=null){
                result.add(root.left);
            }
             if(root.right!=null){
                result.add(root.right);
            }
            return null;
        }
        return root;
    }


    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> result= new ArrayList<>();
        Set<Integer> toDelete = new HashSet<>();

        for(int i: to_delete){
            toDelete.add(i);
        }
        preOrder(root,toDelete, result);
        if(!toDelete.contains(root.val)){
         result.add(root);
        }
        
         return result;
        
    }

}