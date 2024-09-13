package youtubepractice;

import java.util.Scanner;

public class MulitiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows");

		int r = sc.nextInt();

		System.out.println("Enter the number of columns");

		int c = sc.nextInt();

		int matrix[][] = new int[r][c];
System.out.println("Enter the element for Matrix");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		
		
		 

	}

}
