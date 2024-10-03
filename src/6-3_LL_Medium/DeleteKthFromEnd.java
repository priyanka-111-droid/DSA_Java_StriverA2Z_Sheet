public class DeleteKthFromEnd
{
    public static Node removeKthNode(Node head, int K)
    {
        //count total number of nodes
        Node current=head;
        int count=0;
        while(current!=null){
            count++;
            current=current.next;
        }

        //move forward steps
        int forward = count-K;

        Node current2=head;
        Node prev=null;
        int i=0;
        while(i<forward){
            prev=current2;
            current2=current2.next;
            i++;
        }

        //special test case
        /*
        3 3
        1 2 3
         */
        if (prev == null) {
            return head.next; // If kth node from end is the head node
        }

        prev.next = current2.next;
        return head;
    }
}