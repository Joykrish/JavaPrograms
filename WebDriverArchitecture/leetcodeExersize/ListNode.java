package leetcodeExersize;


 
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { 
    	  this.val = val; this.next = next; 
      }
  }
 
class Solution {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode list =head;
        while(list!=null){
            if(list.next==null)break;
            if(list.val==list.next.val){
                list.next=list.next.next;
            }
            else{
                list=list.next;
            }
        }return head;
    }
}

class Test {
    
    public static void main(String[] args) {
    	
    	deleteDuplicates([1,1,2]);
	}
}