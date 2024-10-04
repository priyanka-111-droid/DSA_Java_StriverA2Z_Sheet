/*
Given list of nodes in alternating asc and desc order, sort in non-decreasing order

- selection sort -identify smallest element from unsorted part of list and
move it to front, O(N^2),O(1),gives TLE

Why merge sort will work?
Linked list does not support random access.
It only supports sequential access because the data is not stored in contiguous locations
in the memory. So, if we have to find a node, we will have to traverse the entire list
until the node is found. Because of this, some efficient sorting algorithms like
quicksort/heapsort perform poorly.
- merge sort(recursive)  - O(nlogn) TC , O(logn) SC, but gives Stack overflow
- merge sort(iterative)-  O(nlogn) TC, O(1)
 */
public class SortLinkedList{
    public ListNode sortSelectionSort(ListNode head) {//O(N^2),O(1), so gives TLE
        ListNode current=head; // Start with the head of the list
        int t=0;

        // Outer loop to go through each node in the list
        while(current!=null){
            ListNode nextnode = current.next;

            // Inner loop to find smaller elements
            while(nextnode!=null){

                // If we find a smaller value, swap their values
                if(nextnode.val<current.val){
                    t = nextnode.val;
                    nextnode.val=current.val;
                    current.val=t;

                    nextnode=nextnode.next;
                }else{
                    nextnode=nextnode.next;
                }
            }
            // Move to the next node for the outer loop
            current=current.next;
        }
        return head;
    }
    public ListNode sortList(ListNode head) {
            if (head == null || head.next == null) {
                return head; // List is already sorted
            }

            // Get the length of the linked list
            int length = 0;
            ListNode curr = head;
            while (curr != null) {
                length++;
                curr = curr.next;
            }

            // Create a dummy node to simplify merging
            ListNode dummy = new ListNode(0);
            dummy.next = head;

            // Iteratively merge sublists of increasing sizes
            for (int size = 1; size < length; size *= 2) {
                ListNode prev = dummy;
                ListNode currHead = dummy.next;

                while (currHead != null) {
                    // Split the list into left and right halves
                    ListNode left = currHead;
                    ListNode right = split(left, size);
                    currHead = split(right, size); // Move currHead to the next part

                    // Merge the two halves
                    prev.next = merge(left, right);

                    // Move prev to the end of the merged list
                    while (prev.next != null) {
                        prev = prev.next;
                    }
                }
            }

            return dummy.next; // Return the sorted list
        }

    // Helper method to split the linked list
    private ListNode split(ListNode head, int size) {
        for (int i = 1; head != null && i < size; i++) {
            head = head.next;
        }
        if (head == null) return null;

        ListNode next = head.next;
        head.next = null; // Split the list
        return next; // Return the next part of the list
    }

    // Helper method to merge two sorted linked lists
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Append the remaining nodes
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next; // Return the merged list
    }
}