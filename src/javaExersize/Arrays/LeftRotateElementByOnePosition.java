package javaExersize.Arrays;

import java.util.Arrays;

public class LeftRotateElementByOnePosition {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		
		int size=arr.length;
		int first=arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[size-1]=first;
		System.out.println(Arrays.toString(arr));
		
	}

}
