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
public class CheckLLPalindrome {

    /*
    Note: reversing entire list then comparing didn't work for few test cases,esp with negative nos
    So we will find middle of list,reverse second half of list only and then compare
     */
    public static Node reverse(Node head){
        Node prev = null;
        Node current = head;
        Node nextnode = null;
        while (current != null) {
            nextnode = current.next;
            current.next = prev;
            prev = current;
            current = nextnode;
        }
        head = prev;
        return head;
    }

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true; // Empty or single-node list is a palindrome
        }

        // Find the middle of the linked list using slow and fast pointers
        Node tortoise = head;
        Node hare = head;
        while (hare != null && hare.next != null) {
            hare=hare.next.next;
            tortoise=tortoise.next;
        }

        //reverse second half
        Node reversedhead = reverse(tortoise);

        // Compare the first and reversed second halves
        Node left = head;
        Node right = reversedhead;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true; // Linked list is a palindrome
    }
}
