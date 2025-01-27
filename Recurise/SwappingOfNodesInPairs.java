
class ListNode {

    int data;
    ListNode next;

}

public class SwappingOfNodesInPairs {

    public ListNode recuison(ListNode root) {
        if (root != null && root.next != null) {
            return root;
        }
        ListNode currHead = root.next;
        root.next = recuison(root.next.next);
        currHead.next = root;
        return currHead;

    }

    public static void main(String[] args) {
        System.out.println(" Working on the answers");

    }
}
