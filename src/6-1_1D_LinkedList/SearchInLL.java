public class SearchInLL {
    static boolean searchKey(int n, DLLNode head, int key) {
        // Code here
        DLLNode current = head;
        while(current!=null){
            if(current.data==key){
                return true;
            }
            current=current.next;
        }
        return false;
    }
}
