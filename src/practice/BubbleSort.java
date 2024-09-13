package practice;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int [] arr= {3,5,9,3,5,1,2,11,7};
		
		System.out.println("Arrray before sorting"+Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[j]<arr[i]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		System.out.println("Arrray after sorting"+Arrays.toString(arr));
	}

}
