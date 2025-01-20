package newudemycourse;

import java.util.Arrays;
import java.util.Scanner;

public class SortingBubbleSort {
	public static int [] bubbleSortold(int [] arr) {
		for(int i=1;i<=arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				System.out.println(Arrays.toString(arr));
			}
			System.out.println("After all elements"+Arrays.toString(arr));
		}
		return  arr;
	}
	
	public static int [] bubbleSort(int [] arr) {
		for(int i=1;i<=arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) { 
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				System.out.println(Arrays.toString(arr));
			}
			System.out.println("After all elements"+Arrays.toString(arr));
		}
		return  arr;
	}

	public static void  enhancedSort(int [] arr) {
		int i=0;
		boolean swapped=true;
		while(swapped) {
			swapped=false;
			i++;
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
				
			}
		
		}
		}
		
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array length");
		
		int length=sc.nextInt();
		System.out.println("Enter the array elements");
		int [] array=new int[length];
		
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
		sc.close();
		
		
		
		
		
	}
}
