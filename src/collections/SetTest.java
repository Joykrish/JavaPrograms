package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetTest {
	
	public static void main(String[] args) {
		
	int[] arr1= {1,4,6,10,9,8,7,6,1};
	int[] arr2= {1,4,6,10,9,8,7,6,6};
	//System.out.println("Two arrays are equal: "+verifyEquality(arr1,arr2));
	System.out.println(Arrays.equals(arr1, arr2));
	
	
	
		
}

	private static boolean verifyEquality(int[] arr1, int[] arr2) {
		
		boolean test=true;
		
		if(arr1.length!=arr2.length) {
			test=false;
		}
		else {
			for (int i=0;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i]) {
					test=false;
				}
			}
		}
		return test;
		
		
	}
}
