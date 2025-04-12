package practicejavaprogramsone;

import java.util.Scanner;

public class ArraySparcMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the column count");
		int col=sc.nextInt();
		System.out.println("Enter the row count");
		int row=sc.nextInt();
		
		int [] [] arr=new int[col][row];
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		
		
		int count=0;
		
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				if(arr[i][j]==0) {
					count++;
				}
			}
			
		}
		
		if(count>(col*row)/2) {
			System.out.println("Sparse Matrix");
		}
		else {
			System.out.println("no sparse Matrix");
		}
		
	}

}
