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
public class StartingPointLL {
    public static Node firstNode(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node tortoise = head;
        Node hare = head;

        // Detect cycle
        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;

            if (tortoise == hare) {
                break; // Cycle detected
            }
        }

        // No cycle found
        if (hare == null || hare.next == null) {
            return null;
        }

        // Move tortoise to head and advance both pointers at same pace
        tortoise = head;
        while (tortoise != hare) {
            tortoise = tortoise.next;
            hare = hare.next;
        }

        return tortoise; // Return the node where the cycle begins
    }
}
