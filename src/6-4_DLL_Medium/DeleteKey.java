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
 }

 *****************************************************************/
/*
Delete all occurrences of a key in DLL
 */
public class DeleteKey {
    public static Node deleteAllOccurrences(Node head, int k) {
        // Write your code here.
        Node temp = head;
        while(temp!=null){
            int data = temp.data;
            if(data==k){
                if(temp==head){
                    head=temp.next;
                    if (head != null) { //edge case
                        head.prev = null;
                    }
                }else{
                    Node prev=temp.prev;
                    prev.next=temp.next;
                    if (temp.next != null) { //edge case
                        temp.next.prev = prev;
                    }
                }
            }
            temp=temp.next;
        }
        return head;
    }
}