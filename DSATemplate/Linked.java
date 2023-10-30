

import java.lang.*;
public class Linked  {
    public static void main(String args[])  {

    }
    Node head;
    class Node{
        int val;
        Node next;
        Node(int val) {
           this.val=val;
           this.next= null;
        }
    }
    Linked() {
        head =null;
    }
    public void addBeginNode(int val) {
        Node temp = new Node(val);
        if(head==null){
            head=temp;
        } 
        else {
            temp.next = head;
            head =temp;
        }
    }
    public void display() {
        Node temp = head;
        while(temp!=null){
            System.out.print(" "+ temp.val+ " ");
            temp = temp.next;
        }
    }
   
   public void addNodeAtPos(int pos, int val)  {
    Node temp = new Node(val);
    Node curr = head,prev=null;
    if(pos==0){
        addBeginNode(val);
        return;
    }
    if(head==null)
    {
        throw new IndexOutOfBoundsException("the linked list is empty");
        
    }
    for(int i=0;i<pos-1;i++){
        curr=curr.next;
        if(curr==null){
            throw new IndexOutOfBoundsException("linkedlist reached the end of the list");
            
        }
    }
    temp.next= curr.next;
    curr.next=temp;
   }


   public void removeNodeatPos(int pos)  {
    if(pos==0){
        head= head.next;
        return;
    }
    Node curr= head,prev = null;
    for(int i=1;i<=pos;i++){
        prev=curr;
        curr=curr.next;
    }
    prev.next= curr.next;
   }



}


