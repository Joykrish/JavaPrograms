package practicejavaprogramsone;

import java.util.Scanner;

public class PrintPrimeNumbers {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			int count=0;
			if(i>1) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			}
			if(count==0) {
				System.out.println("Prime number "+i );
			}
		}
		
	}

}
