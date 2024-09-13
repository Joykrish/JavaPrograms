package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ThreeDimentionalArray {

	public static void main(String[] args) {
		int arr[][][] = new int[2][3][4];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					arr[i][j][k]=(int)( Math.random()*1000);
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
				
				
			}
			System.out.println();
			
			
		}

	}
}
