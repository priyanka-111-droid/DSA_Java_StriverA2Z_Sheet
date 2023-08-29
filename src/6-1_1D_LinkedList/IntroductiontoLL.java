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
//store array elements in linked list and return head

public class IntroductiontoLL {
    public static Node constructLL(int []arr) {
        // SLL means SinglyLinkedList
        //building list backwards(using recursion)


        //first attach last element of array into linked list then make next pointer as null.
        Node SLL = new Node(arr[arr.length-1],null);

        //run loop from second last element up till first element
        for(int i=arr.length-2;i>=0;i--){
            SLL = new Node(arr[i],SLL);
        }

        //finally declare Node head and make it equal to fiest element in SLL
        Node head = SLL;
        return head;
    }
}