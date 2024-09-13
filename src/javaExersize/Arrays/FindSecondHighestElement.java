package javaExersize.Arrays;

import java.util.Arrays;

public class FindSecondHighestElement {
	
	public static void main(String[] args) {
		int arr[]= {4,6,7,3,9,5,11,13};
		
		Arrays.sort(arr);
		System.out.println("Second highest Element is " + arr[arr.length-2]);
		
	}
}
