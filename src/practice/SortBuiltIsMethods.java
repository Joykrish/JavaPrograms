package practice;

import java.util.Arrays;
import java.util.Collections;

public class SortBuiltIsMethods {
	public static void main(String[] args) {
		int [] arr = {3,5,9,3,5,1,2,11,7};
	//	System.out.println("Arrray before sorting"+Arrays.toString(arr));
//		Arrays.parallelSort(arr);
//		System.out.println("Arrray after Parallel sorting"+Arrays.toString(arr));
		
		
//		Arrays.sort(arr);
//		System.out.println("Arrray after  sorting using sort"+Arrays.toString(arr));
		
		
		Integer [] arr1 = {3,5,9,3,5,1,2,11,7};
		
		System.out.println("Arrray before sorting"+Arrays.toString(arr1));
		Arrays.sort(arr1,Collections.reverseOrder());
		System.out.println("Arrray after sorting"+Arrays.toString(arr1));
	
	
	}

}
