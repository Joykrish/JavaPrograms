package collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQue {
	public static void main(String[] args) {
		Queue<String> pq = new PriorityQueue<>();
		pq.add("Radhe");
		pq.add("Govinda");
		pq.add("Mukunda");
		pq.add("Madhava");
		pq.add("Krishna");

		System.out.println(pq);
		pq.remove("Govinda");
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		Iterator itr = pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
