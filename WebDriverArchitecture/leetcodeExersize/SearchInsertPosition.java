package leetcodeExersize;

public class SearchInsertPosition {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 6 };
		int target = 5;

		boolean isFound = false;
		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				System.out.println("Element found at index: " + i);
				isFound = true;
				break;

			}

		}

		if (!isFound) {

			if (target < arr[arr.length - 1]) {
				for (int i = 0; i < arr.length; i++) {
					if (target > arr[i] && target < arr[i + 1]) {
						System.out.println("Element can be  inserted at index :" + (i + 1));

					}
				}

			} else {
				System.out.println("Element can be  inserted at index :" + arr.length);
			}

		}

	}

}
