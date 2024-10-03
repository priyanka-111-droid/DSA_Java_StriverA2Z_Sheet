
public class EvenOdd
{
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // If the list is empty or has only one node, return it as is.
        }

        ListNode odd = head; // Pointer to the last odd node
        ListNode even = head.next; // Pointer to the first even node
        ListNode evenHead = even; // Keep track of the start of the even list

        // Rearranging nodes
        while (even != null && even.next != null) {
            odd.next = even.next; // Link the current odd node to the next odd node
            odd = odd.next; // Move the odd pointer
            even.next = odd.next; // Link the current even node to the next even node
            even = even.next; // Move the even pointer
        }

        odd.next = evenHead; // Connect the end of odd list to the start of even list
        return head; // Return the modified list
    }
}