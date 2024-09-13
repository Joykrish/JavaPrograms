package practice;

import java.util.Arrays;

public class ArrayElementDelete {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 8, 9, 5, 11, 34, 65, 90 };

		
		
		arrayAfterElementRemove(arr,11);

	}

	public static int[] arrayAfterElementRemove(int[] arr, int elementTobeRemoved) {
		int index = 0;
		int arr1[] = new int[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == elementTobeRemoved) {
				continue;
			} else {
				arr1[index] = arr[i];
				index++;
			}
		}
		System.out.println("Array before removing element:" + Arrays.toString(arr));
		System.out.println("Array after removing element:" + Arrays.toString(arr1));
		return arr1;

	}

}
