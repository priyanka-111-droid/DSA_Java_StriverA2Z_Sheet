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

public class EvenOdd
{
    public static Node segregateEvenOdd(Node head)
    {
        // Write Your Code Here.
        if (head == null || head.next == null) {
            return head; // No need to rearrange for empty or single-node list
        }

        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;
        Node current = head;


        while (current != null) {
            if (current.data % 2 == 0) {
                //insert at end of even list

                if (evenHead == null) {
                    evenHead = current;
                    evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = evenTail.next;
                }
            } else {
                //insert at end of odd list
                if (oddHead == null) {
                    oddHead = current;
                    oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = oddTail.next;
                }
            }
            current = current.next;
        }


        //no even numbers
        if (evenHead == null) {
            return oddHead;
        } else {
            //connect odd linked list after even linked list.
            evenTail.next = oddHead;
            if (oddTail != null) {
                oddTail.next = null;
            }
            return evenHead;
        }
    }
}