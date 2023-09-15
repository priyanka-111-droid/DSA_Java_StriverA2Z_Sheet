/********************************************************

 Following is the class structure of the Node class:

 class Node
 {
 public:
 int data;
 Node next;
 Node(int data)
 {
 this.data = data;
 this.next = null;
 }
 };

 ********************************************************/
//giving TLE...
public class RemoveDuplicatesSortedDLL {
    public static Node uniqueSortedList(Node head) {
        if(head==null)
            return head;

        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.data == temp.next.data)
            {
                temp.next= temp.next.next;
            }
            else
                temp=temp.next;
        }
        return head;
    }
}