package practicejavaprogramtwo;

public class ImplementStackUsingArray {
    int arr[] = new int[5]; // Stack size is 5
    int top = -1; // Initialize top as -1 (indicating stack is empty)

    // Push operation (adds an element to the stack)
    private boolean push(int x) {
        if (top == arr.length - 1) { // Check for stack overflow
            System.out.println("Stack Overflow! Cannot push " + x);
            return false;
        }
        arr[++top] = x; // First increment top, then add element
        System.out.println("Element pushed to stack: " + x);
        return true;
    }

    // Pop operation (removes and returns the top element)
    private int pop() {
        if (top == -1) { // Check for stack underflow
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        }
        int x = arr[top--]; // Get the top element, then decrement top
        System.out.println("Element popped from stack: " + x);
        return x;
    }

    // Peek operation (returns the top element without removing it)
    private int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1; 
        }
        return arr[top];
    }

    public static void main(String[] args) {
        ImplementStackUsingArray stack = new ImplementStackUsingArray();

        stack.push(20);
        stack.push(21);
        stack.push(22);
        stack.push(23);
        stack.push(24);
        stack.push(25); // This will show "Stack Overflow!"

        stack.pop();
        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // This will show "Stack Underflow!"
    }
}
