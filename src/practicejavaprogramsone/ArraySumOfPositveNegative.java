package practicejavaprogramsone;

import java.util.Scanner;

public class ArraySumOfPositveNegative {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arraySize=sc.nextInt();
		int arr[]=new int[arraySize];
		System.out.println("Enter the array numbers");
		
		for(int i=0;i<arraySize;i++) {
			arr[i]=sc.nextInt();
		}
		int nSum=0;
		int pSum=0;
		for(int i=0;i<arr.length;i++) {
			if((arr[i]<0)&&(arr[i]!=0)) {
				System.out.println(arr[i]);
				nSum+=arr[i];
			}
			
			if((arr[i]>0)&&(arr[i]!=0)) {
				System.out.println(arr[i]);
				pSum+=arr[i];
			}
			
			
		}
		
		System.out.println("Sum is: "+nSum);
		System.out.println("Sum is: "+pSum);
		
	}

}
