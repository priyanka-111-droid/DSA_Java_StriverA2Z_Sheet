/*
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

- 2 pointer approach:
Dummy Node: A dummy node is created and points to the head of the list. This helps simplify edge cases, such as removing the head node itself.
First Pointer: The first pointer is moved n + 1 steps ahead of the second pointer. This ensures that when the first pointer reaches the end of the list, the second pointer is just before the node that needs to be removed.
Both Pointers: Both pointers are moved together until the first pointer reaches the end of the list.
Remove Node: The second pointer’s next node is bypassed, effectively removing the N-th node from the end.
Return Result: The modified list is returned, starting from dummy.next.
O(L) TC where L is length of list and O(1) SC.
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0); // Create a dummy node to simplify edge cases
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // Move first pointer n + 1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the N-th node from the end
        second.next = second.next.next;

        return dummy.next; // Return the head of the modified list
    }
}
