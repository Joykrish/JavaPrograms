package newudemycourse;

import java.util.Scanner;

public class ArrayPrintEvenNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arraySize=sc.nextInt();
		int arr[]=new int[arraySize];
		System.out.println("Enter the array numbers");
		
		for(int i=0;i<arraySize;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
				sum+=arr[i];
			}
		}
		
		System.out.println("Sum is: "+sum);
		
		
	}

}
