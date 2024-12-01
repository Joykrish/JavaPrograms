package newudemycourse;

import java.util.Scanner;

public class ArraySymentricornot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of cols");
		int cols = sc.nextInt();
		System.out.println("Enter the number of rows");
		int row = sc.nextInt();
		
		int [][] arr=new int[cols][row];
		int [][] traspose=new int[row][cols];
		
		for(int i=0;i<cols;i++) {
			for(int j=0;j<row;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<cols;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				traspose[i][j]=arr[j][i];
			}
		}
		System.out.println("------------------");
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(traspose[i][j]+" ");
				
			}
			System.out.println();
		}
		boolean flag=true;
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				if(arr[i][j]!=traspose[i][j]) {
					flag=false;
					break;
				}
			}
			
		}
		if(!flag) {
			System.out.println("asymmetric");
		}
		else {
			System.out.println("symmetric");
		}
	}

}
