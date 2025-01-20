package collections;

import java.util.Stack;

public class StackSort {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();

		st.push(10);
		st.push(5);
		st.push(8);
		st.push(2);
		st.push(9);
		st.push(4);
 
		System.out.println(st);

		System.out.println(stackSort(st));
	}

	public static Stack<Integer> stackSort(Stack<Integer> st) {
		Stack<Integer> temp = new Stack<Integer>();

		while (!st.isEmpty()) {
			int item = st.pop();
			while (!temp.isEmpty() && temp.peek() > item) {
				int greaterItem = temp.pop();
				st.push(greaterItem);
			}
			temp.push(item);

		}

		return temp;
	}

}
