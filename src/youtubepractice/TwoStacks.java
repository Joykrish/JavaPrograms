package youtubepractice;

public class TwoStacks {

	int size, top1, top2;
	int arr[];

	public TwoStacks(int size) {
		this.size = size;
		arr = new int[size];
		top1 = -1;
		top2 = size;
	}

	private void push1(int x) {
		if (top1 < top2) {
			top1++;
			arr[top1] = x;
			System.out.println("Pushed Element in stack 1-" + x);
		} else {
			System.out.println("Stack is overflow");
			System.exit(1);
		}
	}

	private void push2(int x) {
		if (top1 < top2 - 1) {
			top2--;
			arr[top2] = x;
			System.out.println("Pushed Element in stack 2-" + x);
		} else {
			System.out.println("Stack is overflow");
			System.exit(1);
		}
	}

	private int pop1() {
		if (top1 >= 0) {
			int x = arr[top1];
			System.out.println("Poped Element from stack  is" + x);
			top1--;
			return x;

		} else {
			System.out.println("Statck underflow");
			System.exit(1); 
		}
		return 0;

	}

	private int pop2() {
		if (top2 < size) {
			int x = arr[top2];
			System.out.println("Poped Element from stack  is" + x);
			top2--;
return x;
		} else {
			System.out.println("Statck underflow");
			System.exit(1);
			
		}
		return 0;
	}
	
	public static void main(String[] args) {
		TwoStacks st=new TwoStacks(10);
		st.push1(10);
		st.push1(20);
		st.push1(30);
		st.pop1();
		st.push2(40);
		st.push2(50);
		st.push2(60);
		st.pop2();
		
		
	}

}
