/****************************************************************

 Following is the class structure of the Node class:

 class Node {
 public int data;
 public Node next;

 Node()
 {
 this.data = 0;
 this.next = null;
 }

 Node(int data)
 {
 this.data = data;
 this.next = null;
 }

 Node(int data, Node next)
 {
 this.data = data;
 this.next = next;
 }
 };

 *****************************************************************/

public class DeleteMiddle {
    public static Node deleteMiddle(Node head) {
        if(head.next==null || head==null){
            return null;
        }
        Node hare=head;
        Node tortoise=head;
        Node prev=null;
        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            prev=tortoise;
            tortoise=tortoise.next;
        }
        prev.next=tortoise.next;
        return head;

    }
}