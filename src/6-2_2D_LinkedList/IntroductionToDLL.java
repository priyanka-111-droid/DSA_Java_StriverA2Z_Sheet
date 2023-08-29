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

//build doubly linked list

public class IntroductionToDLL
{
    public static Node constructDLL(int []arr) {
        //method 1 - build list forwards
//        Node head = new Node(arr[0]);
//        Node temp = head;
//        for(int i=1;i<arr.length;i++){
//            Node newNode = new Node(arr[i]);
//            temp.next = newNode;
//            newNode.prev = temp;
//            temp = temp.next;
//        }
//        return head;


        //method 2 - build list backwards
        //insert last element
        Node DLL = new Node(arr[arr.length-1],null,null);

        //loop from second last element to first element
        for(int i=arr.length-2;i>=0;i--){
            Node p=DLL;
            DLL = new Node(arr[i],DLL,p);
        }
        Node head=DLL;
        return head;
    }
}