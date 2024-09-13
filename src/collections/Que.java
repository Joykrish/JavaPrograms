package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Que {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<Integer>();
		for(int i=0;i<5;i++) {
			q.add(i);
		}
		System.out.println("Elements of Q are: "+q);
		
		int removeDel=q.remove();
		System.out.println("Removed element is: "+removeDel);
		System.out.println(q);
		
		int head=q.peek();
		
		System.out.println("Head is "+head);
		int size=q.size();
		System.out.println("Size is "+size);
	}
	

}
