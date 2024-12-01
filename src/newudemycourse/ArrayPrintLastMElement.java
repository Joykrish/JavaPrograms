package newudemycourse;

import java.util.Scanner;

public class ArrayPrintLastMElement {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
					
		}
		System.out.println("enter the last number count: ");
		int count=sc.nextInt();
		if(count<size) {
		for(int i=size-count;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		}
		else {
			System.out.println("Enter the valid count ");
		}
	}

}
