/*
- floyd's cycle detection or tortoise-hare algo
 */
public class DetectLoop {

    public static boolean detectCycle(Node head) {
        public boolean hasCycle(ListNode head) {
            //edge case
            if (head == null) {
                return false; // Empty list has no cycle
            }

            ListNode tortoise = head; // Tortoise starts at head
            ListNode hare = head; // Hare also starts at head
            while (hare != null && hare.next != null) {
                tortoise = tortoise.next; // Move tortoise one step
                hare = hare.next.next; // Move hare two steps

                if (tortoise == hare) {
                    return true; // Cycle detected
                }
            }

            return false; // No cycle
        }

    }