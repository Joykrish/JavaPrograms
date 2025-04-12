package practicejavaprogramtwo; 

import java.util.Arrays;

public class LeftRotateArray3Elements {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		int n = 3;

		for (int j = 1; j <= n; j++) {
			int first = arr[0];
			int size = arr.length;
			for (int i = 0; i < size - 1; i++) {
				arr[i] = arr[i + 1];
			}

			arr[size - 1] = first;
		}
		System.out.println(Arrays.toString(arr));
	}

}
