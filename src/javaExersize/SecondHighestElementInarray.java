package javaExersize;

import java.util.Arrays;

public class SecondHighestElementInarray {
	
	public static void main(String[] args) {
		int [] arr= {1,5,7,8,4,2,9,10,12};
		
		Arrays.sort(arr);
		System.out.println("Second highest element is " + arr[arr.length-2]);
	}

}
