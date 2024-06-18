

class Solution {
    public TreeNode helper(TreeNode root){
        if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }
        else {
            TreeNode RightAllchild = root.right;
            TreeNode LastNode = findLastNode(root.left);
            LastNode.right = RightAllchild;
            return root.left;
        }
    }

    public TreeNode findLastNode(TreeNode root){
        if(root.right==null){
            return root;
        }
         return findLastNode(root.right);

    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) {
            return null;
        }

        if(root.val==key){
       
            return helper(root);
        }

        TreeNode dummy = root;
        while(root!=null){
            if(root.val >key)  {
            if(root.left!=null && root.left.val ==key){
                root.left = helper(root.left);
                break;
            }
            else {
                root =root.left;
            }
            }
            else {
                if (root.right!=null && root.right.val ==key){
                root.right = helper(root.right);
                break;
            }
            else {
                root =root.right;
            }
            }
        }
        return dummy;
    }
    
}