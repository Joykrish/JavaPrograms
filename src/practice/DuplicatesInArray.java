package practice;

import java.util.Arrays;

public class DuplicatesInArray {
	
	public static void main(String[] args) {
		int [] arr= {1,3,4,6,4,5,7,6,7};
		//bruiteforceApproach(arr);
		findduplicatesusingSorting(arr);
		
		
	}
	
	public static void bruiteforceApproach(int [] arrr) {
		for(int i=0;i<arrr.length;i++) {
			for(int j=i+1;j<arrr.length;j++) {
				if(arrr[i]==arrr[j]) {
					System.out.println("Duplicate number is "+arrr[i]);
				}
			}
		}
	}
public static void findduplicatesusingSorting(int[] arr) {
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]==arr[i+1]) {
			System.out.println("Duplicate element is"+arr[i]);
		}
	}
	
}
}
