package practicejavaprogramtwo;

import java.util.Arrays;

public class MIssingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4,5,6, 8, 9, 10 };

		int sum=0;
		int expectedsum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
		for(int i=1;i<=arr[arr.length-1];i++) {
			expectedsum=expectedsum+i;
		}
		System.out.println(expectedsum);
		
		System.out.println("Missing element is: "+(expectedsum-sum));
	}

}
