/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * */
public class FindMiddle
{
    public ListNode middleNode(ListNode head) {
        //hare-tortoise algo/slow-fast algo
        ListNode hare = head;
        ListNode tortoise = head;
        while(hare!=null && hare.next!=null){
            hare = hare.next.next;
            tortoise = tortoise.next;
        }
        return tortoise;
    }
}