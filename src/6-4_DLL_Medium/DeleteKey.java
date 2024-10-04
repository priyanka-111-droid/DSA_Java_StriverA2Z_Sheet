/*
Delete all occurrences of a key in DLL
 */
public class DeleteKey {
    public static Node deleteAllOccurrences(Node head, int k) {
        Node current = head;
        while(current!=null){
            int value = current.data;
            if(value==x){
                if(current==head){
                    head = current.next;
                    head.prev=null;
                }else{
                    Node prev=current.prev;
                    prev.next=current.next;
                    if (current.next != null) { //edge case
                        current.next.prev = prev;
                    }
                }
            }
            current = current.next;
        }
        return head;
    }
}