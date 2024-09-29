class ArrayToLL {
    static DLLNode constructLL(int arr[]) {
            DLLNode head = new DLLNode(arr[0]);
            DLLNode current = head;
            for(int i = 1;i<arr.length;i++){
                current.next = new DLLNode(arr[i]);
                current = current.next;
            }
            return head;
    }
}