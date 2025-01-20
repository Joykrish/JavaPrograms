package newudemycourse;

import java.util.Scanner;

public class ArraySwapColumns {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of cols");
		int cols=sc.nextInt();
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		System.out.println("Enter the number of arra");
		int [] [] arr=new int[cols][rows];
		for(int i =0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		
		for(int i =0;i<cols;i++) { 
			for(int j=0;j<rows;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the columns to be swiped");
		int col1=sc.nextInt();
		int col2=sc.nextInt();
		int temp=0;
		for(int i=0;i<cols;i++) {
			temp=arr[i][col1-1];
			arr[i][col1-1]=arr[i][col2-1];
			arr[i][col2-1]=temp;
		}
		System.out.println("after swap");
		
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
