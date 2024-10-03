public class ReverseLLRecursion {
    public ListNode reverseList(ListNode head) {
        //base case
        if(head==null || head.next==null){
            return head;
        }
        //leap of faith
        ListNode newHead = reverseList(head.next);

        //to reverse link between head and head.next
        ListNode temp = head.next;
        temp.next = head;
        head.next=null;

        //return new head
        return newHead;
    }
}
