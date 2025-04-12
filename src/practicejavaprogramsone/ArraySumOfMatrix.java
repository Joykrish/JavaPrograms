package practicejavaprogramsone;

import java.util.Scanner;

public class ArraySumOfMatrix {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the column count");
		int col=sc.nextInt();
		System.out.println("Enter the row count");
		int row=sc.nextInt();
		System.out.println("Enter the arry values");
		int arr1[][]=new int[col][row];
		
		int arr2[][]=new int[col][row];
		int arr3[][]=new int[col][row];
		System.out.println("Enter the arry values of first array");
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the arry values of second array");
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
