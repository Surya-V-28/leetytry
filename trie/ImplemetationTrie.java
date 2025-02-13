
public class ImplemetationTrie {

    public static void main(String[] args) {
        System.out.print("Working on the answers");
        Tire c = new Tire();
        c.insert("surya");
        System.out.println(c.startsWith("sy"));
        System.out.println(c.serach("surya"));
    }
}

class Tire {

    class TryNode {

        TryNode[] childrenNode;
        boolean isCompleted;

        TryNode() {
            isCompleted = false;
            childrenNode = new TryNode[26];
        }

    }
    TryNode root;

    public Tire() {
        root = new TryNode();
    }

    public void insert(String word) {
        TryNode node = root;

        for (char c : word.toCharArray()) {
            if (node.childrenNode[c - 'a'] == null) {
                node.childrenNode[c - 'a'] = new TryNode();
            }
            node = node.childrenNode[c - 'a'];
        }
        node.isCompleted = true;
    }

    public boolean serach(String word) {
        TryNode node = root;
        for (char c : word.toCharArray()) {
            if (node.childrenNode[c - 'a'] == null) {
                return false;
            }
            node = node.childrenNode[c - 'a'];
        }
        return node.isCompleted;
    }

    public boolean startsWith(String word) {
        TryNode node = root;
        for (char c : word.toCharArray()) {
            if (node.childrenNode[c - 'a'] == null) {
                return false;
            }
            node = node.childrenNode[c - 'a'];
        }
        return true;
    }
}
