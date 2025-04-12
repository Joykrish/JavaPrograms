package practicejavaprogramsone;

import java.util.Scanner;

public class CreatePrintMatrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number of columns");
	
	int c=sc.nextInt();
	
	System.out.println("Enter the number of rows");
	int r=sc.nextInt();
	
	int [][]arr=new int[c][r];
	
	for(int i=0;i<c;i++) {
		for(int j=0;j<r;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	
	for(int i=0;i<c;i++) {
		for(int j=0;j<r;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
	
	
	
}
}
