
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

    public static void NormalLoopWays(ListNode root) {

        ListNode dummy = new ListNode();
        ListNode prev = root;

        while (prev != null && prev.next != null) {
            ListNode nextPointerNext = prev.next.next;
            ListNode secondNode = prev.next;
            prev.next = nextPointerNext;
            secondNode.next = prev;
            dummy.next = secondNode;
            dummy = prev;
            prev = nextPointerNext;

        }

    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode prev = head;

        while (prev != null && prev.next != null) {
            ListNode npn = prev.next.next;
            ListNode second = prev.next;

            second.next = prev;
            prev.next = npn;
            dummy.next = second;

            dummy = prev;
            prev = npn;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        System.out.println(" Working on the answers");

    }
}
