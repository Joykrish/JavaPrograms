package linkedlist;

public class SinglyLinkedList {
	
	private ListNode head;
	
	
	public boolean hasLoop() {
		ListNode slowptr=head,fastPtr=head;
		
		while(slowptr!=null &&fastPtr!=null & fastPtr.getNext()!=null) {
			slowptr=slowptr.getNext();
			fastPtr=fastPtr.getNext().getNext();
			if(slowptr==fastPtr) {
				return true;
			}
		}
		return false;
	}
	public void create(int data) {
		ListNode newNode = createNewNode(data);;
		
		
		if(head==null) {
			head=newNode;
		}else {
			ListNode temp=head;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(newNode);
		}
	}
	
	public void reverse() {
		ListNode previousNode=null,nextNode=null; 
		while(head!=null) {
		nextNode=head.getNext();
		head.setNext(previousNode);
		previousNode=head;
		head=nextNode;
		}
		head=previousNode;
	}

	private ListNode createNewNode(int data) {
		ListNode newNode=new ListNode();
		newNode.setData(data);
		newNode.setNext(null);
		return newNode;
	}
	
	public void insertAtBegining(int data) {
		ListNode newNode=createNewNode(data);
		newNode.setNext(head);
		head=newNode;
		
	}
	
	public void insterAfter(int position,int data) {
		ListNode newNode=createNewNode(data);
		
		if(head==null) {
			head=newNode;
		}else if(position==0){
			ListNode temp=newNode;
			temp.setNext(head);
			head=temp;
			
		}else {
			ListNode temp=head;
			for(int i=0;i<position;i++) {
				temp=temp.getNext();
			}
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
		
	}
	
	public void insertAtEnd(int data) {
		ListNode newNode=createNewNode(data);
		if(head==null) {
			head=newNode;
		}
		else {
			ListNode p=head;
			while(p.getNext()!=null) {
				p=p.getNext();
			}
			p.setNext(newNode);
		}
		
		
	}
public void traverse() {
	ListNode currentNode=head;
	while(currentNode!=null) {
		System.out.println(currentNode.getData());
		System.out.println(currentNode.getNext());
		currentNode=currentNode.getNext();
	}
	
}
}
