package newudemycourse;

import java.util.Scanner;

public class ArraySecondaryDiagonal {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the column count: ");
		int col=sc.nextInt();
		System.out.println("Enter the row count: ");
		int row=sc.nextInt();
		
		System.out.println("Enter the arr elements: ");
		int arr[][]=new int[col][row];
		
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Print diagonals");
		
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				if((i+j)==row-1) {
					System.out.println(arr[i][j]);
				}
			}
		}
		
	}

}
