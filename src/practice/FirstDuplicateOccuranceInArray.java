package practice;

public class FirstDuplicateOccuranceInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6, 7, 8, 3, 10, 6, 5 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate occurance is" + arr[i]);
					break;

				}
			}

		}
	}

}
