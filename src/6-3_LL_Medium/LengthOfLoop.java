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
 };

 *****************************************************************/

public class LengthOfLoop
{
    public static int lengthOfLoop(Node head) {
        // Write your code here

        //base case
        if(head==null || head.next==null){
            return 0;
        }

        Node tortoise = head.next;
        Node hare = head.next.next;
        while(hare!=null && hare.next!=null){
            if(tortoise==hare){
                break;
            }
            tortoise=tortoise.next;
            hare=hare.next.next;
        }

        // No cycle found
        if (hare == null || hare.next == null) {
            return 0;
        }


        // Count the length of the cycle

        //the code initializes the count variable to 1 (since we are
        // already on the first node of the cycle) and positions the hare pointer
        // to start moving through the cycle.
        int count = 1;
        hare = hare.next;
        while (tortoise != hare) {
            hare = hare.next;
            count++;
        }

        return count;
    }
}