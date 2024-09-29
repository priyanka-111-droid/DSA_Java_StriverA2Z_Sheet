public class DLLDeletionAtGivenPosition {
    public DLLNode deleteNode(DLLNode head, int x) {
        // Handle case where the list is empty
        if (head == null) {
            return null;
        }

        // Handle case where the head needs to be deleted
        if (x == 1) {
            return head.next; // Return the next node as the new head
        }

        DLLNode current = head;
        // Traverse to the node just before the one we want to delete
        for (int i = 1; current != null && i < x - 1; i++) {
            current = current.next;
        }

        // Current is now the node before the one we want to delete
        current.next = current.next.next; // Skip the node at position x
        return head; // Return the modified list
    }

}
