


import java.util.*;



class ListNode {
    int val;
    ListNode next;
    ListNode() {

    }
    ListNode(int val ) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}



public class ReverseLinkedList {
    public static void main(String args[]){
        System.out.println("Working");

        
       ListNode prev = null;
       ListNode current = head;

       while(current!=null){
           ListNode next = current.next;
           current.next = prev;
           prev = current;
           current = next;
       }

       return prev;
    }
}