package javaExersize;

import java.util.Scanner;

public class NumberIsPrimeOrNot {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		System.out.println(count);
		if(count>1) {
		System.out.println(num +" is not prime");
		
		}
		else {
			System.out.println(num +" is prime");
		}
	}

}
