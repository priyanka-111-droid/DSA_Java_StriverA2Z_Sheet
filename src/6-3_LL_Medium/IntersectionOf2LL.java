/*
Input: listA = [4,1,8,4,5], listB = [5,6,1,8,4,5]
Output: 8

- 2pointer approach by aligning starting points, O(m+n) TC and O(1) SC.
 */
public class IntersectionOf2LL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        // Step 1: Calculate the lengths of both linked lists
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        // Step 2: Align the starting points
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }

        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }

        // Step 3: Traverse both lists together
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA; // Intersection found
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null; // No intersection
    }

    private int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}
