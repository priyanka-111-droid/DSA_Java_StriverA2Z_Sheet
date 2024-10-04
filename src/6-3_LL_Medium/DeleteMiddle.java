/*
Input: head = [1,3,4,7,1,2,6]
Output: [1,3,4,1,2,6]

- tortoise-hare algo with prev node.
 */
public class DeleteMiddle {
    public ListNode deleteMiddle(ListNode head) {
        //edge case
        //if list empty or only 1 node,return null
        if(head==null || head.next==null){
            return null;
        }
        //get middle node of linked list
        ListNode hare = head;
        ListNode tortoise = head;
        ListNode prev = null;//track prev node
        while(hare!=null && hare.next!=null){
            prev=tortoise;//track prev node.
            hare = hare.next.next;
            tortoise = tortoise.next;
        }
        ListNode temp = tortoise.next;
        prev.next = temp;
        return head;
    }
}