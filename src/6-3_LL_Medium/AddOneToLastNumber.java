import java.util.* ;
import java.io.*;
/*************************************************************

 Following is the class structure of the Node class:

 class Node {
 public int data;
 public Node next;

 Node(int data) {
 this.data = data;
 this.next = null;
 }
 }

 *************************************************************/
/*
Add one to a number represented as Linked List
 */
public class AddOneToLastNumber {
    public static Node addNode(Node head) {
        if(head == null) return head;

        if(head.next == null) return new Node(head.data+1);

        Node current=head;
        while(current!=null){
            current=current.next;
        }
        current.data+=1;
        return head;
    }
}