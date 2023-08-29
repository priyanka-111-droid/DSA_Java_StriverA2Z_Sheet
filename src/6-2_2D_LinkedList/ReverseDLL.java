/****************************************************************

 Following is the class structure of the Node class:

 class Node {
 public int data;
 public Node next;
 public Node prev;

 Node()
 {
 this.data = 0;
 this.next = null;
 this.prev = null;
 }

 Node(int data)
 {
 this.data = data;
 this.next = null;
 this.prev = null;
 }

 Node(int data, Node next)
 {
 this.data = data;
 this.next = next;
 this.prev = next;
 }
 };

 *****************************************************************/

public class ReverseDLL
{
    public static Node reverseDLL(Node head)
    {
        if(head.next==null){
            return head;
        }

        Node current=head;
        Node previous=null;
        while(current.next!=null){
            Node nextnode = current.next;
            current.next=previous;
            previous=current;
            current=nextnode;
        }
        //current stops at last node;
        current.next=previous;
        head=current;
        return head;

    }
}