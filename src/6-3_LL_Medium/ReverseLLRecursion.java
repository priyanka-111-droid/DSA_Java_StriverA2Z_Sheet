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
 }

 *****************************************************************/

public class ReverseLLRecursion
{
    public static Node reverseLinkedList(Node head)
    {
        /*
        null<-1<-2<-3<-4<-head
              c  n
                 c  n
                    c  n
                       c
        */

        if (head == null || head.next == null)
            return head;

        /* reverse the rest list and put
        the first element at the end */
        Node rest = reverseLinkedList(head.next);
        head.next.next = head;


        head.next = null;

        /* fix the head pointer */
        return rest;
    }
}
