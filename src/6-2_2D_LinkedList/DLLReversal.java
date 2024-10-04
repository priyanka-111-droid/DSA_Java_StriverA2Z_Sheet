public class DLLReversal {
    public DLLNode reverseDLL(DLLNode head) {

        if(head==null || head.next==null){
            return head;
        }
        //this will store our Previous Node which we will used to make prev Node
        //to make it as Next node of Current Node
        DLLNode previousNode = null;
        DLLNode current = head;

        while (current != null) {
            previousNode = current.prev;
            current.prev = current.next;
            current.next = previousNode;
            current = current.prev;
        }
        return previousNode.prev;
    }
}
