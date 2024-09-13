package javaExersize.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSortAscendingandDescendingOrder {
	
	public static void main(String args[]) {
		String arr[]= {"s","v","d","f","k","i","a","t"};
		
		Arrays.sort(arr);
		
		System.out.println("After soring"+Arrays.toString(arr));
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		System.out.println("After descending soring"+Arrays.toString(arr));
	}

}
