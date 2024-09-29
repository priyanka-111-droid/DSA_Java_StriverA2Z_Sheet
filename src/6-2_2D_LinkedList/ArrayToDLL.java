public class ArrayToDLL {
    DLLNode constructDLL(int arr[]) {
        // Code here
        DLLNode head = new DLLNode(arr[0]);
        DLLNode current = head;
        for(int i = 1;i<arr.length;i++){
            DLLNode newNode = new DLLNode(arr[i]);
            current.next = newNode;
            newNode.prev = current;
            current = current.next;
        }
        return head;
    }
}
