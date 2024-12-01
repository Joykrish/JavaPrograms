package newudemycourse;

import java.util.Scanner;

public class FibonacciSeriesUsingRecurssion {
	
	
	private static int fibonacci(int i) {
		if(i==0||i==1) {
			return i;
		}else {
			return fibonacci(i-1)+fibonacci(i-2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.print(fibonacci(i)+" ");
		}
	}

}
