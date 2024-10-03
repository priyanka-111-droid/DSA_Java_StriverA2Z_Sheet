public class CheckLLPalindrome {

    /*
    Note: Reversing the entire list means you have to traverse the entire list twice: once to reverse it and once to compare the values. This results in a time complexity of O(n) and could involve additional space (O(n) if you store the reversed list).
    So we will find middle of list,reverse second half of list only and then compare.This is O(n) TC
     */
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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // Empty or single-node list is a palindrome
        }

        // Find the middle of the linked list using slow and fast pointers
        ListNode tortoise = head;
        ListNode hare = head;
        while (hare != null && hare.next != null) {
            hare=hare.next.next;
            tortoise=tortoise.next;
        }

        // Compare the first half and the reversed second half
        ListNode firstHalf = head;
        ListNode secondHalf =  reverseList(tortoise);

        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true; // The linked list is a palindrome
    }
}
