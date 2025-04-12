package practicejavaprogramtwo;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedarray {
	
	public static void main(String[] args) {
		int [] arr= {1,2,2,3,4,4,4, 5,6,7,7,9};
		
		int j=0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}  
		}
		
		arr[j]=arr[arr.length-1];
		int arr1[]=new int[j+1];
		for(int k=0;k<=j;k++) {
			System.out.print(arr[k]+" ");
			arr1[k]=arr[k];
		}
		System.out.println();
		System.out.println(Arrays.toString(arr1));
	}
	 
	

}
