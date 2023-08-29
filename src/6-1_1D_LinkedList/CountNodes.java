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
//Q)count nodes in linked list

public class CountNodes {
    public static int length(Node head){
        //recursive solution
        return helper(head); //use a helper method.
    }
    private static int helper(Node head){
        if(head==null){
            return 0;
        }
        //count node at that place (+1) then go to next node
        return 1+ helper(head.next);
    }
}