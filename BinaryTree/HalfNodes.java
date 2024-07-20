

public class HalfNodes {
    public static void main(String args[]) {
        System.out.println("Working");
        // here root is the given Node so change the int to Node int the code
        int root;
        removeHalfNodes(root);
    }
    
    public int removeHalfNodes(int root){
        if(root==null) return;

        root.left = removeHalfNodes(root)
    }
}