package newudemycourse;

import java.util.Scanner;

public class CheckPerfectNumber {
	
	
	public static boolean isPerfect(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
			sum=sum+i;	
			}
			
		
	}
		return sum==num;
	}
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked: ");
		int num=sc.nextInt();
		
		System.out.println("Number is Perfect number: "+isPerfect(num));
			
		sc.close();
		}
	
			
	}


