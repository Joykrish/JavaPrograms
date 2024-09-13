package youtubepractice;

import java.util.HashSet;
import java.util.Set;

public class TwoSumProblem {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 30, 20, 10, 5 };

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (!set.add(arr[i])) {
				System.out.println("Duplicate elemtn is " + arr[i]);
			}
		}

	}
}
