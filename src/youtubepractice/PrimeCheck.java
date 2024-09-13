package youtubepractice;

import java.util.Scanner;

public class PrimeCheck {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to check");
		int counter = 0;
		int num=sc.nextInt();
		
		for(int i=1;i<num;i++) {
			
			if(num%i==0) {
				counter++;
			}
			
			
		}
		System.out.println("counter is"+counter);
		if(counter==1) {
		System.out.println("Number is Prime ");
		}
		else {
			
			System.out.println("Number is not prime");
		}
	}

}
