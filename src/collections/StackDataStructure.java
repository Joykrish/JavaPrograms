package collections;

import java.util.Stack;

public class StackDataStructure {
	
	public static void main(String[] args) {
	 Stack<Integer> stack = new Stack<>();

     // Push operation
     stack.push(10);
     stack.push(20);
     stack.push(30);
     System.out.println("Stack after push: " + stack); // [10, 20, 30]
     
//     for(Integer i:stack) {
//    	 System.out.println("data value is"+i);
//     }

     // Peek operation
     System.out.println("Top element: " + stack.peek()); // 30

     // Pop operation
     stack.pop();
     System.out.println("Stack after pop: " + stack); // [10, 20]

     // Check if empty
     System.out.println("Is stack empty? " + stack.isEmpty()); // false

     // Stack size
     System.out.println("Stack size: " + stack.size()); // 2
 }
}
