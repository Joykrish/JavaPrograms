package youtubepractice;

import java.util.Scanner;

public class NumberOfODDEVENDIGIT {
	
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int num=sc.nextInt();
		int evencount = 0;
		int oddcount = 0;
		while(num>0) {
			int reminder=num%10;
			
			if(reminder%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
			num=num/10;
		}
		
		System.out.println(evencount);
		System.out.println(oddcount);
		
		
		
		
	}

}
