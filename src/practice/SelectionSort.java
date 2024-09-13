package practice;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr1 = { 29, 61, 8, 10, 11, 9, 15, 31, 46, 65 };
		System.out.println("Before Selection Sort" + Arrays.toString(arr1));

		selectionSort(arr1);
		System.out.println("After Selection Sort" + Arrays.toString(arr1));

	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}

			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
	}

}
