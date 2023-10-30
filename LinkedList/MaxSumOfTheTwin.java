
 //* Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    //option 2 no extra memory but I will modify list
public int pairSum(ListNode head) {
/*
    linked N SIZE
    n i even

    ican find half and us stack

    reverser first hals
*/
var fast = head;
var slow = head;
ListNode prev = null;
while (fast != null && fast.next != null) {
    fast = fast.next.next;
    var temp = slow.next;
    slow.next = prev;
    prev = slow;
    slow = temp;
}
/*
    1 2 3 4 5 6
s.        *
p.*  
f              ^ 
*/
var max = 0;
while (prev != null) {
    max = Math.max(max, prev.val + slow.val);
    prev = prev.next;
    slow = slow.next;
}
return max;
}

//option 1 stack extra memory needed
// public int pairSum(ListNode head) {
//     /*
//         linked N SIZE
//         n i even

//         ican find half and us stack

//         reverser first hals
//     */

//     var fast = head;
//     var slow = head;
//     var stack = new LinkedList<Integer>();
//     while (fast != null && fast.next != null) {
//         // 1 2 3 4
//         //         *
//         //     *
//         stack.add(slow.val);
//         slow = slow.next;
//         fast = fast.next.next;
//     }
//     var max = 0;
//     while (stack.size() > 0) {
//         max = Math.max(max, stack.removeLast() + slow.val);
//         slow = slow.next;
//     }
//     return max;
// }
}