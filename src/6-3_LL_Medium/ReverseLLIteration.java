/**
 * https://mostlyfocused.com/pages/articles/how_to_reverse_linked_list
 */
public class ReverseLLIteration
{
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while(current!=null){

            ListNode temp = current.next;//need to save a reference to the next node in the sequence before we flip the pointer.
            current.next = prev; // take each node's next pointer and swapping it from the node to the right, to the node on the left.
            prev = current; //current node now becomes prev.
            current = temp;//next node becomes current
        }
        return prev; //since current is null, prev has new head pointer.
    }
}
