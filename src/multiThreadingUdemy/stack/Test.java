package multiThreadingUdemy.stack;

public class Test {
	public static void main(String[] args) throws Exception {
		ArrayStack stack= new ArrayStack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack.top());
		System.out.println("-------------");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
