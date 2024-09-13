package youtubepractice;

import java.util.Arrays;

public class MissingNumberArray {

	public static void main(String[] args) {
		int arr[] = { 1,2,3,5,6,7,8,9};
		System.out.println("Missing number is"+missinNumber(arr));

	}

	public static int missinNumber(int[] arr) {

		Arrays.sort(arr);

		int arrSum = 0;

		for (int i = 0; i < arr.length; i++) {
			arrSum = arrSum + arr[i];
		}
		int sum = 0;
		System.out.println("Existing arr sum: " + arrSum);
		for (int i = 1; i <= arr[arr.length - 1]; i++) {
			sum = sum + i;

		}
		System.out.println("arr sum: " + sum);
		System.out.println("Missing Element is" + (sum - arrSum));
		return sum - arrSum;

	}

}
