package practice;

import java.util.Arrays;

public class SortSelection {
	
	
	public static void main(String [] args) {
		int [] arr={8,9,2,4,5,3,1,7};
		
	
		System.out.println(Arrays.toString(SelectionSort(arr)));
		
	}
	public static int[] SelectionSort(int [] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			int min=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					int temp=arr[min];
					arr[min]=arr[j];
					arr[j]=temp;
					
				}
					
			
			}
		}
		return arr;
		
	}
}
