package collections;

import java.util.Stack;

public class Stackreverse {
	
	public static void main(String [] args) {
		Stack<Integer> st = new Stack<Integer>();

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		Stack<Integer> st1 = new Stack<Integer>();
		Stack<Integer> st2 = new Stack<Integer>();

		System.out.println(st);
		
		exchangeStack(st,st1);
		exchangeStack(st1,st2);
		exchangeStack(st2,st);
		
		System.out.println(st);
	}
	
	public static Stack<Integer> exchangeStack(Stack<Integer> source,Stack<Integer> Destination){
		
		while(!source.isEmpty()) {
			int ele=source.peek();
			Destination.push(ele);
			source.pop();
			
		}
		return Destination;
		
	}

}
