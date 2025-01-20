package leetcodeExersize;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {

	public static void main(String[] args) {

		int[] arr = { 2, 7, 4, 1, 8, 4};
		System.out.println(lastStoneWeight(arr));
	}

	public static int lastStoneWeight(int[] arr) {

		PriorityQueue<Integer> pq = new PriorityQueue(new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {
				// TODO Auto-generated method stub
				return b - a;
			}

		});

		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}

		while (pq.size() > 1) {
			int stone1 = pq.poll();
			int stone2 = pq.poll();

			if (stone1 > stone2) {
				pq.add(stone1 - stone2);

			}
		}
		if (pq.isEmpty()) {
			return 0;
		}
		return pq.poll();
	}
}
