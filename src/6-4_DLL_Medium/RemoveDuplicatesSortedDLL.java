
public class RemoveDuplicatesSortedDLL {
    Node removeDuplicates(Node head){
        //edge case
        if(head==null || head.next==null)
            return head;

        Node current = head,temp = head.next;
        while(temp!=null){
            if(current.data!=temp.data){
                current.next = temp;
                temp.prev = current;
                current = current.next;
            }
            temp = temp.next;
        }

        //edge case
        if(current.next!=null){
            current.next=null;
        }
        return head;
    }
}