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


public class SearchIfElementPresent
{
    public static int searchInLinkedList(Node head, int k)
    {
        // recursion (use helper method)
        return helper(head,k);
    }
    private static int helper(Node head,int k){
        if(head.data==k){
            return 1;
        }
        if(head.next==null){ //if we have reached last element in list and it is also not k
            return 0;
        }
        return helper(head.next,k);
    }
}