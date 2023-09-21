public class SortStack{
    public static void sortStack(Stack<Integer> stack) {
        //remove top element
        int top = stack.pop();
        //recursively sort remaining
        sortStack(stack);
        //insert top back into sorted stack
        insertStack(stack,top);
    }
    public static void insertStack(Stack<Integer>stack,int element){
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertStack(stack, element);
        stack.push(top);
    }
}