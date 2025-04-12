package practicejavaprogramtwo;

import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		int arr [][]=new int[2][3];
		
		arr[0][0]=4;
		arr[0][2]=8;
		
		arr[1][0]=10;
		arr[1][1]=15;
		arr[1][2]=20;
		
//		System.out.println(arr[1][0]);
//		
//		System.out.println(arr[1].length);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	
}
}