/*
Reverse stack using recursion.
 */
import java.util.Stack;
public class reverseStack{
    // Method to reverse the stack using recursion
    static void reverse(Stack<Integer> s) {
        // Base case: If the stack is empty, return
        if (s.isEmpty()) {
            return;
        }

        // Remove the top element
        int top = s.pop();

        // Reverse the remaining stack
        reverse(s);
`
        // Insert the removed element at the bottom
        insertAtBottom(s, top);
    }

    // Helper method to insert an element at the bottom of the stack
    static void insertAtBottom(Stack<Integer> s, int item) {
        // Base case: If the stack is empty, push the item
        if (s.isEmpty()) {
            s.push(item);
            return;
        }

        // Remove the top element
        int top = s.pop();

        // Recursively call insertAtBottom
        insertAtBottom(s, item);

        // Push the removed element back onto the stack
        s.push(top);
    }
}
