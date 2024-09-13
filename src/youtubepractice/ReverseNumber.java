package youtubepractice;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int reverseNum=0;
		
		while(num>0) {
			
			int reminder=num%10;
			reverseNum=(reverseNum*10)+reminder;
			
			num=num/10;
		}
		
		System.out.println(reverseNum);
	}

}
