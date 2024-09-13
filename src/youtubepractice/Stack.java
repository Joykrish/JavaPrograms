package youtubepractice;

public class Stack {
	
	int arr[]=new int[5];
	
	  int top=-1;
	
	private boolean push(int x) {
		top++;
		arr[top]=x;
		System.out.println("Element push to the stack "+x);
		return true;
	}

	private int pop() {
	
		int x=arr[top];
		top--;
		System.out.println("Element pop from stack"+x);
		return x;
	}
	
	private int peek() {
		return arr[top];
	}
	
	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		st.pop();
		
		System.out.println("Printing the topmost value is"+st.peek());
	}
}
