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

public class DeleteLast {
    public static Node deleteLast(Node list){
        //temp pointer to  traverse till last node
        Node lastNode=list;
        Node prev=list;
        while(lastNode.next!=null){
            prev = lastNode;
            lastNode=lastNode.next;
        }
        prev.next=null;//second last node's pointer set to null
        return list;
    }
}