/****************************************************************

 Following is the class structure of the Node class:

 class Node {
 public int data;
 public Node next;

 Node()
 {
 this.data = 0;
 this.next = null;
 }

 Node(int data)
 {
 this.data = data;
 this.next = null;
 }

 Node(int data, Node next)
 {
 this.data = data;
 this.next = next;
 }
 }

 *****************************************************************/

public class SortZeroOneTwo
{
    public static Node sortList(Node head) {
        //similar to dutch national flags
        Node zeroptr = new Node(0);
        Node oneptr = new Node(0);
        Node twoptr = new Node(0);


        Node zeroHead = zeroptr;
        Node oneHead = oneptr;
        Node twoHead = twoptr;

        Node current=head;
        while(current!=null){
            if(current.data==0){
                zeroptr.next=current;
                zeroptr=zeroptr.next;
            }else if(current.data==1){
                oneptr.next=current;
                oneptr=oneptr.next;
            }else{
                twoptr.next=current;
                twoptr=twoptr.next;
            }
            current=current.next;
        }

        zeroptr.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        oneptr.next = twoHead.next;

        // Set the next of the last element to null to avoid cycles
        twoptr.next = null;

        // The new head will be the next element of the zero partition
        //head node zeroHead is a dummy node created for the zero partition,
        //and the actual sorted list starts from its next node
        Node sortedHead = zeroHead.next;

        return sortedHead;
    }
}