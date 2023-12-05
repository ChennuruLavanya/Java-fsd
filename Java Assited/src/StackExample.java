import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        pushElement(stack, 10);
        pushElement(stack, 20);
        pushElement(stack, 30);

        displayStack(stack);

        popElement(stack);
        popElement(stack);

       
        displayStack(stack);
    }


    private static void pushElement(Stack<Integer> stack, int element) {
        System.out.println("Pushing element: " + element);
        stack.push(element);
    }

    
    private static void popElement(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
        } else {
            System.out.println("Popping element: " + stack.pop());
        }
    }

    
    private static void displayStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements: " + stack);
        }
    }
}
