package youtubepractice;

public class CompareTwoArrays {

	public static void main(String[] args) {
		int []arr1= {1,2,3,4,5,6};
		int []arr2= {1,2,3,4,5,6};
		
		System.out.println(compareArrays(arr1,arr2));
		
		

	}

	public static boolean compareArrays(int[] arr1, int[] arr2) {

		if (arr1.length == arr2.length) {

			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					return false;

				}
				
			}
			return true;
			
		} else {
			return false;
		}

	}

}
