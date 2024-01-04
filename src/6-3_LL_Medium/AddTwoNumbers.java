import java.util.* ;
import java.io.*;
/****************************************************************

 Following is the class structure of the Node class:

 class LinkedListNode {
 int data;
 LinkedListNode next;

 public LinkedListNode(int data) {
 this.data = data;
 }
 }

 *****************************************************************/

//tricky part - take care of carry
public class AddTwoNumbers {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode head3 = new LinkedListNode(0);
        LinkedListNode current = head3;
        int carry = 0;

        while (head1 != null || head2 != null || carry > 0) {
            int value1 = (head1 != null) ? head1.data : 0;
            int value2 = (head2 != null) ? head2.data : 0;


            int sum = value1 + value2 + carry;
            // Update the carry for the next iteration
            carry = sum / 10;

            // Create a new node with the remainder of the sum and add it to the result list
            current.next = new LinkedListNode(sum % 10);
            current = current.next;

            if (head1 != null) head1 = head1.next;
            if (head2 != null) head2 = head2.next;
        }

        return head3.next;
    }
}