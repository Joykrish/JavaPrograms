package practicejavaprogramtwo;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 3, 6, 8, 9, 11, 16 };
		int[] arr2 = { 2, 5, 6, 12, 11, 3 };
		findIntersection(arr1,arr2);

	}

	public static void findIntersection(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<Integer>();

		for (int a : arr1) {
			set.add(a);
		}

		for (int a : arr2) {
			if (set.contains(a)) {
				System.out.println(a);
			}
		}
	}

}
