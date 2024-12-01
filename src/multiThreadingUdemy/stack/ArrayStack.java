package multiThreadingUdemy.stack;

public class ArrayStack {
	private int[] stack;
	
	int top=-1;
	
	public ArrayStack() {
		this(10);
	}

	public ArrayStack(int capacity) {
		// TODO Auto-generated constructor stub
		stack=new int[capacity];
	}
	
	
	public int size() {
		
		return top+1;
		
	}
	
	public boolean isEmpty() {
		return top<0;
	}
	
	public void push(int data) throws Exception {
		
		if(size()==stack.length) {
			throw new Exception("Stack is full");
		}
		
		stack[++top]=data;
	}
	
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("stack is empty");
		}
		int data=stack[top];
		stack[top--]=Integer.MIN_VALUE;
		return data;
	}

	public int top() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty");
		}
		return stack[top];
	}
}
