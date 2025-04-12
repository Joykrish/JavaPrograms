package practicejavaprogramsone;

import java.util.Arrays;
import java.util.Scanner;

public class SortingInsertionSort {
	
	public static void insertionSort(int [] arr) {
		for(int i=0;i<arr.length;++i) {
			int j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j=j-1;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array length");

		int length = sc.nextInt();
		System.out.println("Enter the array elements");
		int[] array = new int[length];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		insertionSort(array);
		System.out.println(Arrays.toString(array));
		sc.close();
		
	}

}
