package practicejavaprogramtwo;

public class SmallestLargestofArray {

	public static void main(String[] args) {
		int[] arr = { 38, 31, 4, 7, 98,101, 17, 45, 33, 11 };

		int smallest = arr[0];
		int largest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			} else if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		
		System.out.println("smallest is "+smallest);
		System.out.println("largest is "+largest);
		
	}
}
