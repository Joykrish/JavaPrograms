package practicejavaprogramtwo;

import java.util.Scanner;

public class Readmatrix {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=0;
		int c=0;
		
		System.out.println("Enter the no of rows in a  matrix");
		r=sc.nextInt();
		
		
		System.out.println("Enter the no of columns in a  matrix");
		c=sc.nextInt();
		
		
		int matrix[][]=new int[r][c];
		System.out.print("Enter the elements of the matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				matrix[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Displaying the elements in matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
			
		}
	}

}
