public class CountLinkedListNodes {
    // Function to count nodes of a linked list.
    public int getCount(DLLNode head) {
        // code here
        DLLNode current = head;
        int k = 1;
        while(current.next!=null){
            k++;
            current=current.next;
        }
        return k;
    }
}
