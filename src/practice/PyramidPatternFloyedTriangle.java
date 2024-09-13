package practice;

import java.util.Scanner;

public class PyramidPatternFloyedTriangle {
	public static void main(String[] args) {
	int n,c,d,num=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit");
	n=sc.nextInt();
	
	for(c=1;c<=n;c++) {
		for(d=1;d<=c;d++) {
			System.out.print(num +" ");
			num++;
		}
		System.out.println(" ");
		
	}
}
}
