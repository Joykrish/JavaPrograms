package leetcodeExersize;

public class RemoveDuplicateFromSortedList {
	
	public static void main(String [] args) {
		
	}
	
	public ListNode FindDulicates(ListNode head) {
		
		ListNode current=head;
		while(current!=null && current.next!=null) {
			if(current.val==current.next.val) {
				current.next=current.next.next;
			}
			else {
				current=current.next;
			}
		}
		return head;
		
	}

}
