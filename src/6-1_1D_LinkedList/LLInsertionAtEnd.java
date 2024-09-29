public class LLInsertionAtEnd {
    // Function to insert a node at the end of the linked list.
    DLLNode insertAtEnd(DLLNode head, int x) {
        if(head==null){
            head = new DLLNode(x);
            return head;
        }
        DLLNode current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = new DLLNode(x);
        return head;
    }
}
