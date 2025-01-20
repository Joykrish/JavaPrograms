package leetcodeExersize;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixDiagonalSum2 {
	
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
		
		System.out.println(diagonalSum(arr));
	}

	public static int  diagonalSum(int [] [] arr) {
		
		int length=arr.length;
		
		int sum=0;
		
		for(int i=0;i<length;i++) {
			sum=sum+arr[i][i];
			sum=sum+arr[length-1-i][i];
		}
		if(length%2!=0) {
			sum=sum-arr[length/2][length/2];
		}
		
		return sum;
	}
}
