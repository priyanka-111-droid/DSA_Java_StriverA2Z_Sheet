public class DLLInsertionAtGivenPosition {
    // Function to insert a new node at given position in doubly linked list.
    DLLNode addNode(DLLNode head, int p, int x) {
        DLLNode newNode = new DLLNode(x);

        // Special case for inserting at the head
        if (p == 0) {
            newNode.next = head; // New node points to the current head
            if (head != null) {
                head.prev = newNode; // Current head's previous points to new node
            }
            return newNode; // New node becomes the new head
        }


        DLLNode current = head;
        for (int i = 0; i < p; i++) {
            current = current.next;
        }

        // Insert the new node
        newNode.next = current.next; // New node points to the next node
        newNode.prev = current; // New node's previous points to current
        current.next = newNode; // Current's next now points to the new node
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
        return head; // Return the unchanged head of the list
    }
}
