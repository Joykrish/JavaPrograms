package collections;

import java.util.Stack;

public class StackInsertElmentIndex {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(50);
		st.push(60);
		

		System.out.println(st);
		int index = 3;
		int element = 40;

		insertInTheMiddle(3,40,st);
		System.out.println(st);

	}

	public static void insertInTheMiddle(int index, int value, Stack<Integer> s) {
		Stack<Integer> temp = new Stack<Integer>();
		for (int i = 1; i < s.size() - index; i++) {
			int item = s.peek();
			temp.push(item);
			s.pop();
		}
		s.push(value);
		while (!temp.empty()) {
			int item = temp.peek();
			s.push(item);
			temp.pop();
		}
	}

}
