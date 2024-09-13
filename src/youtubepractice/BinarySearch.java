package youtubepractice;

public class BinarySearch {

	public static void main(String[] args) {
		int [] arr= {10,20,30,50,100};
		int searchElment=300;
		System.out.println(binarySearch(arr,0,arr.length-1,searchElment));

	}

	public static int binarySearch(int[] arr, int low, int high, int searchElment) {
		int mid = (low + high) / 2;
		if (high >= low) {

			if (arr[mid] == searchElment) {
				return mid;
			}
			if (searchElment > arr[mid]) {
				return binarySearch(arr, mid + 1, high, searchElment);
			}
			if (searchElment < arr[mid]) {
				return binarySearch(arr, low, mid - 1, searchElment);
			}

		}
		return -1;
	}
}
