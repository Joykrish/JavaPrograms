package youtubepractice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 7,5,9, 1, 3, 4, 2, 3 };

		System.out.println("Before sorting: " + Arrays.toString(arr));

		bubbleSort(arr);

		System.out.println("After sorting: " + Arrays.toString(arr));
	}

	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {

				if (arr[j - 1] < arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}

}
