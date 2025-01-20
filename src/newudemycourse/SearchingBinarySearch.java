package newudemycourse;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchingBinarySearch {
	public static void main(String[] args) {

		int[] a = { 100, 200, 10, 20, 30, 40, 70, 90 };

		Arrays.sort(a);

		// int index=BinaySearch(a,70,0,a.length-1);

		int index = BinaySearch(a, 70, 0, a.length - 1);
		if (index == -1) {
			System.out.println("Number not found");
		} else {
			System.out.println("number  found at index: " + index);
		}

	}

	private static int BinaySearch(int[] a, int num, int low, int high) {
		while (low <= high) {
			int mid = (high + low) / 2;

			if (a[mid] == num) {
				return mid;
			}
			if (num > a[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	private static int RecursiveBinaySearch(int[] a, int num, int low, int high) {

		while (low <= high) {
			int mid = (low + high) / 2;

			if (a[mid] == num) {
				return mid;
			}
			if (a[mid] > num) {
				return RecursiveBinaySearch(a, num, low, mid - 1);
			} else {
			return 	RecursiveBinaySearch(a, num, mid + 1, high);
			}
		}
		return -1;
	}

}
