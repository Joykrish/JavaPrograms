package multiThreadingUdemy.stack;

public class Linkedstack {
	
	private ListNode top;
	private int length;
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public int size() {
		return length;
	}
	
	public void push(int data) {
		ListNode temp=new ListNode();
		temp.setData(data);
		temp.setNext(top);
		top=temp;
		length++;
	}

	public int pop() throws Exception {
		if(!isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int result=top.getData();
		top=top.getNext();
		length--;
		return result;
	}
	
	public int peek() throws Exception {
		if(!isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return top.getData();
		
	}
}
