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

 Node(int data, Node next, Node prev)
 {
 this.data = data;
 this.next = next;
 this.prev = prev;
 }
 };

 *****************************************************************/

public class DeleteLastDLL
{
    public static Node deleteLastNode(Node head) {
        // Write your code here
        Node lastNode=head;

        // if list empty or 1 element in list
        if(head==null || head.next==null){
            return null;
        }

        //if more than 1 element present,traverse till last node
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }

        Node secondLast = lastNode.prev;
        secondLast.next=null;
        return head;
    }
}