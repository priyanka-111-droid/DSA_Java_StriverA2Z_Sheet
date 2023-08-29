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

public class FindMiddle
{
    public static Node findMiddle(Node head)
    {
        //hare-tortoise/fast-slow pointer algorithm
        Node hare = head;
        Node tortoise = head;
        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            tortoise = tortoise.next;
        }
        return tortoise;
    }
}