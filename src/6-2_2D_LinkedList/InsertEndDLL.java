/****************************************************************

 Following is the class structure of the Node class:

 class Node {
 public int data;
 public Node next;
 public Node prev;

 Node()
 {
 this.data = 0;
 this.next = null;
 this.prev = null;
 }

 Node(int data)
 {
 this.data = data;
 this.next = null;
 this.prev = null;
 }

 Node(int data, Node next, Node prev)
 {
 this.data = data;
 this.next = next;
 this.prev = prev;
 }
 };

 *****************************************************************/

public class InsertEndDLL
{
    public static Node insertAtTail(Node list, int K) {
        // Write your code here
        Node newNode = new Node(K);

        //insert in empty list
        if(list==null){
            list=newNode;
            return list;
        }

        //if list not empty,traverse till end
        Node lastNode=list;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
        newNode.prev=lastNode;

        return list;
    }
}