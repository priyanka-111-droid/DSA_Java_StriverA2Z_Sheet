public class SortStack{
    public Stack<Integer> sort(Stack<Integer> s) {
        // Base case: if stack is empty, return it
        if (s.isEmpty()) {
            return s;
        }
        // Remove top element
        int top = s.pop();
        // Recursively sort the remaining stack
        sort(s);
        // Insert the top element back into the sorted stack
        insertStack(s, top);

        return s; // Return the sorted stack
    }
    public static void insertStack(Stack<Integer>stack,int element){
        //if incoming element greater than top of element already present, incoming ele shd be at top of stack.
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertStack(stack, element);
        stack.push(top);
    }
}