package newudemycourse;

import java.util.Scanner;

public class ArraysSwapRows {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of cols");
		int cols = sc.nextInt();
		System.out.println("Enter the number of rows");
		int row = sc.nextInt();
		
		int [][] arr=new int[cols][row];
		
		for(int i=0;i<cols;i++) {
			for(int j=0;j<row;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("before swapping");
		for(int i=0;i<cols;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("Enter rows to be swapped");
		int row1=sc.nextInt();
		int row2=sc.nextInt();
		int temp=0;
		for(int i=0;i<row;i++) {
			temp=arr[row1-1][i];
			arr[row1-1][i]=arr[row2-1][i];
			arr[row2-1][i]=temp;
			
			
		}
		
		System.out.println("after swapping");
		for(int i=0;i<cols;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
