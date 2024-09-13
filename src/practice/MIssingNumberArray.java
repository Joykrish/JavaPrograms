package practice;

import java.util.Arrays;

public class MIssingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4,5, 7, 8, 9, 10 };

		int sum = 0;
		int expectedsum=0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		for(int i=1;i<=10;i++) {
			expectedsum=expectedsum+i;
		}

		System.out.println(sum);
		System.out.println(expectedsum);
		System.out.println("Array is"+Arrays.toString(arr));
		System.out.println("missing number:" +(expectedsum-sum));

	}

}
