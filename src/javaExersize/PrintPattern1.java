package javaExersize;

import java.util.Scanner;

public class PrintPattern1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of starts you want to print ");
		int limit=sc.nextInt();
		
		for(int i=1;i<=limit;i++) {
			for(int j=0;j<i;j++) {
			System.out.print("*");
		}
			System.out.println();
		}
		for(int i=limit-1;i>=1;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
				System.out.println();
			}
		}
		
		
}

