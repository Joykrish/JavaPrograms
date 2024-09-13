package javaExersize.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int [] arr= {1, 1, 2, 2, 4, 5, 7, 7, 6};
		
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}
		}
		arr[j]=arr[arr.length-1];
		for(int k=0;k<=j;k++) {
			System.out.print(arr[k]+ " ");
		}
		
	}
}
