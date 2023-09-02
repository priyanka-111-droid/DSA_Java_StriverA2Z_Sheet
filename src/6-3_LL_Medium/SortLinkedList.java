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
/*
Given list of nodes in alternating asc and desc order, sort in non-decreasing order
 */
public class SortLinkedList{
    public static Node sortList(Node head) {
        Node current=head;
        int t=0;
        while(current!=null){
            Node nextnode = current.next;

            while(nextnode!=null){
                if(nextnode.data<current.data){
                    t = nextnode.data;
                    nextnode.data=current.data;
                    current.data=t;

                    nextnode=nextnode.next;
                }else{
                    nextnode=nextnode.next;
                }
            }

            current=current.next;
        }
        return head;
    }
}