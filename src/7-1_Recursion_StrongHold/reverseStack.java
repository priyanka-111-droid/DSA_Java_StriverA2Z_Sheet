/*
Reverse stack using recursion.
In recursion,remember Base-Hypothesis-Induction
 */
import java.util.Stack;
public class reverseStack{
    public static void reverseStack(Stack<Integer> stack) {
        // write your code here
        if(stack.isEmpty()){
            return;
        }
        System.out.print(stack.pop()+" ");//print and remove top element
        reverseStack(stack);
    }
}
