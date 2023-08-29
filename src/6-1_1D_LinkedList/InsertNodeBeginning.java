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

 Node(int data, Node next)
 {
 this.data = data;
 this.next = next;
 this.prev = next;
 }
 };

 *****************************************************************/

public class InsertNodeBeginning
{
    public static Node insertAtFirst(Node list, int newValue) {
        //create new node
        Node newNode = new Node(newValue);

        //if list empty ,then just insert new node.
        if(list==null){
            list=newNode;
        }else{
            newNode.next=list;
            list=newNode;
        }
        return list;
    }
}