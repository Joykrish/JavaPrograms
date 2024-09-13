package practice;

import java.util.Arrays;

public class RemoveElementFromarray {

	public static void main(String[] args) {
		int [] array= {1,2,5,6,8,7,9};
		int elementTobeRemoved=5;
		
		int[] arrAfterRemove=removeElment(array,elementTobeRemoved);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(arrAfterRemove));
		
		
	}
	
	public static int  [] removeElment(int [] arr,int element) { 		
		int newArray[]=new int [arr.length-1];
		
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=element) {
				newArray[index]=arr[i];
				index++;
				
			}
		}
		return newArray;
	}
}
