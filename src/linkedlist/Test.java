package linkedlist;

public class Test {
	public static void main(String[] args) {
		SinglyLinkedList linkedList=new SinglyLinkedList();
		linkedList.create(1);
		linkedList.create(2);
		linkedList.create(3);
		linkedList.create(4);
//		linkedList.insertAtBegining(20);
//		linkedList.insertAtEnd(22);
//		linkedList.insterAfter(4, 30);
		linkedList.reverse();
		linkedList.traverse();
		
	}

}
