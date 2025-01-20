package collections;

import java.util.Stack;

public class StackMinElement {
	
	
	static Stack<Integer> st=new Stack<Integer>();
	
	static Stack<Integer> temp=new Stack<Integer>();
	
	
	
	public static void main(String []args) {
		  
		customPush(15);
		customPush(10);
		customPush(5);
		customPush(1);
		customPop();
		customPush(8);
		System.out.println("Minimum element is"+ temp.peek());
	}
	
	public static void customPush(int i) {
		st.push(i);
		
		if(temp.isEmpty()) {
			temp.push(i);
		}
		else if(temp.peek()>i) {
			temp.push(i);
		}
		
	}
	
	public static  void customPop() {
		
		int item=st.peek();
		st.pop();
		
		if(item==temp.peek()) {
			temp.pop();
		}
		
	}
	
	
	
	
	

}
