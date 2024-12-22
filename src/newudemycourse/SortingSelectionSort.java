package newudemycourse;

import java.util.Arrays;
import java.util.Scanner;

public class SortingSelectionSort {

	public static void selectionSort(int[] arr) {

		int min, temp, size = arr.length;

		for (int i = 0; i < arr.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < size; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			System.out.println("array after iteration: "+Arrays.toString(arr));
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array length");

		int length = sc.nextInt();
		System.out.println("Enter the array elements");
		int[] array = new int[length];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		selectionSort(array);
		System.out.println(Arrays.toString(array));
		sc.close();
	}

}
