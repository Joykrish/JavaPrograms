package practice;

public class ImplementStackUsingArray {
	
		int arr[]=new int[5];
		int top=0;
		
		private boolean push(int x) {
			top++;
			arr[top]=x;
			System.out.println("Element push to the stack" +x);
			return true;
			
			
		}
		private int pop() {
			int x=arr[top--];
			System.out.println("Element pop from stack"+x);
			return  x;
			
		}
		private int peek() {
			return arr[top];
		}
		
		public static void main(String[] args) {
			ImplementStackUsingArray im=new ImplementStackUsingArray();
			im.push(20);
			im.push(21);
			im.push(22);
			im.push(23);
			
			im.pop();
			System.out.println("Top element"+im.peek());
			
		}
	}

	
	


