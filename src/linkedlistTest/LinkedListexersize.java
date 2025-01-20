package linkedlistTest;

public class LinkedListexersize {

	class Node {

		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}

	}

	static Node head = null;
	Node tail = null;

	public void addNodeAtEnd(int i) {
		Node newNode = new Node(i);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.next = null;
			tail = newNode;
		}
	}

	public void printLinkedListValue(Node headNode) {
		Node currentNode = headNode;

		while (currentNode != null) {
			System.out.println(currentNode.val);
			currentNode = currentNode.next;
		}
	}

	public int verifyValuePresentOrnot(Node headNode, int value) {
		Node currentNode = headNode;

		while (currentNode != null) {
			if (currentNode.val == value)
				return 1;
			currentNode = currentNode.next;

		}
		return -1;
	}
	
	public void addnodeAtStart(int i) {
		
		Node newNode = new Node(i);
		newNode.next=head;
		
		head=newNode;
		
	}
	
	public void addNodeAtIndex(int val,int index) {
		
		int count=1;
		Node current=head;
		while(current!=null && count!=index-1) {
			current=current.next;
			count++;
		}
		
		Node newNode=new Node(val);
		Node temp=current.next;
		current.next=newNode;
		newNode.next=temp;
		
	}
	
	public void deleteNodeAtEnd() {
		Node current=head;
		
		while(current.next.next!=null) {
			current=current.next;
		}
		current.next=null;
		tail=current;
	}
	
	public void removeIndexatSpecificNode(int index) {
		
		if (index==1) {
			deleteNodeAtbegining();
		}
		else {
		Node current=head;
		int count=1;
		while(current!=null && count!=index-1) {
			current=current.next;
			count++;
		}
		current.next=current.next.next;
		}
		
	}
	
	
	public void deletetheNodeOfEvenValue() {
		Node current=head;
		
		while(current!=null) {
			if(current.val%2==0) {
				removeIndexatSpecificNode(current.val);
			}
			current=current.next;
		}
	}
	public void deleteNodeAtbegining() {
		head=head.next;
	}
	
	
	public void reverseLinkedList() {
		Node next=null;
		Node previous=null;
		Node current=head;
		
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		printLinkedListValue(previous);
	}
	

	public static void main(String[] args) {
		LinkedListexersize l = new LinkedListexersize();
		l.addNodeAtEnd(10);
		l.addNodeAtEnd(20);
		l.addNodeAtEnd(30);
		l.addNodeAtEnd(40);
		
		l.addnodeAtStart(50);
		
		l.printLinkedListValue(head);
		System.out.println("-------------------------");
		System.out.println(l.verifyValuePresentOrnot(head,50));
		System.out.println("-------------------------");
		l.addNodeAtIndex(100,3);
		l.printLinkedListValue(head);
		System.out.println("-------------------------");
		l.deleteNodeAtEnd();
		System.out.println("-------------------------");
		l.printLinkedListValue(head);
		l.deleteNodeAtbegining();
		System.out.println("-------------------------");
		l.printLinkedListValue(head);
		
		l.removeIndexatSpecificNode(2);
		
		System.out.println("------------------after deletion--------------------");
		l.printLinkedListValue(head);
		System.out.println("------------------after reverse--------------------");
		l.reverseLinkedList();
		
	}

}
