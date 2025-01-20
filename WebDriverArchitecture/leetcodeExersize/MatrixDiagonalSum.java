package leetcodeExersize;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixDiagonalSum {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		System.out.println("Enter the number of cols");
		
		int cols=sc.nextInt();
		
		int[] []  arr=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int arr1[]:arr) {
			System.out.println(Arrays.toString(arr1));
		}
		int diaSum=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(i==j) {
					diaSum+=arr[i][j];
				}
			}
		}
		System.out.println(diaSum);
		sc.close();
	}

}
