package javaExersize;

import java.util.Scanner;

public class FindFactors {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find factorial");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		
		
	}

}