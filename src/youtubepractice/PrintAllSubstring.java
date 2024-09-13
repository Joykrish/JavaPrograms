package youtubepractice;

import java.util.Arrays;

public class PrintAllSubstring {

	public static void main(String[] args) {

		int[] arr = { -10,-6,-1,2, 4, 5,6,8,9 };
		int[] arr1 = sortedSquareArray(arr);

		System.out.println(Arrays.toString(arr1));

	}

	private static int[] sortedSquareArray(int[] arr) {
		int[] sortedSquareArray = new int[arr.length];
		int start = 0;
		int end = arr.length - 1;

		int SortedArraindex = arr.length - 1;
		while (start <= end) {
			if (arr[start] * arr[start] > arr[end] * arr[end]) {
				sortedSquareArray[SortedArraindex--] = arr[start] * arr[start];
				start++;
			} else {
				sortedSquareArray[SortedArraindex--] = arr[end] * arr[end];
				end--;
			}

		}
		return sortedSquareArray;
	}
}
