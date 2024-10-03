
public class StartingPointCycleLL {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        // Step 1: Determine if a cycle exists.
        ListNode tortoise = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;       // Move tortoise one step
            hare = hare.next.next;          // Move hare two steps

            if (hare == tortoise) {         // Cycle detected
                break;
            }
        }

        // If hare reached the end, no cycle exists
        if (hare == null || hare.next == null) {
            return null;
        }

        // Step 2: Find the start of the cycle
        tortoise = head;  // Reset tortoise to head
        while (tortoise != hare) {
            tortoise = tortoise.next;
            hare = hare.next;
        }

        return tortoise; // The start of the cycle
    }
}
