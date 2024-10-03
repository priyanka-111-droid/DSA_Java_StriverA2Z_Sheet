public class LengthOfLoop
{
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        if(head==null || head.next==null){
            return 0;
        }
        //detect loop
        Node tortoise = head;
        Node hare = head;
        while(hare!=null && hare.next!=null){
            hare = hare.next.next;
            tortoise = tortoise.next;
            if(hare==tortoise){
                //cycle detected
                break;
            }
        }
        if(hare==null || hare.next==null){
            return 0;
        }
        //count length of loop
        //Once a loop is detected, you can simply move one pointer (e.g., hare) around the loop while counting until it meets tortoise again
        //no need to move both tortoise and hare which would unnecessarily complicate it.
        int count = 1;  //Start counting from the meeting point
        hare = hare.next;
        while(tortoise!=hare){
            count+=1;
            hare = hare.next;
        }
        return count;
    }
}