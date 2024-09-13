package youtubepractice;

import java.util.Arrays;

public class MoveAllNegativestoThestart {
	
	
	public static int[] arrangeElement(int [] arr) {
		int[] arranged = new int[arr.length];
		
		int j = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < 0) {
				arranged[j] = arr[i];
				j++;
			}

		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0) {
				arranged[j] = arr[i];
				j++;
			}

		}
		return arranged;
		
	}

	public static void main(String[] args) {
		int[] arr = { -1, 3, 5, 6, -2, 3, -2, 4, 8 };
		//arrangeElement(arr);
		
		
		System.out.println("Rearragned array="+Arrays.toString(arrangeElement(arr)));
	}

}
