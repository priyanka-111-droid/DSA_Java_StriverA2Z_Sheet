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

public class DetectLoop {

    public static boolean detectCycle(Node head) {
        //floyd's cycle detection or tortoise-hare algo

        //base case
        if(head==null || head.next==null){
            return false;
        }

        Node tortoise = head;
        Node hare = head.next;
        while(hare!=null){//until hare at end of linked list
            if(hare==tortoise){
                return true;//there is cycle
            }
            if(hare.next==null){//if hare at last element
                return false;
            }
            hare=hare.next.next;
            tortoise=tortoise.next;
        }
        return false;
    }
}