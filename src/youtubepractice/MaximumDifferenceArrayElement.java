package youtubepractice;

public class MaximumDifferenceArrayElement {

	public static void main(String[] args) {

		int[] arr = { 10, 2, 20, 30, 50, 100, 5 };

		System.out.println(maximumDifference(arr));

	}

	public static int maximumDifference(int arr[]) {

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		return max - min;
	}

}
