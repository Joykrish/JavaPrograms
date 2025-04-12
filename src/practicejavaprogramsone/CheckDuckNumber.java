package practicejavaprogramsone;

import java.util.Scanner;

public class CheckDuckNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		boolean count=false;
		while(num!=0) {
			int reminder=num%10;
			if(reminder==0) {
				count=true;
				break;
			}
			num=num/10;
		}
		
		if(count) {
			System.out.println("The number is duck number");
		}
		else {
			System.out.println("The number is not  duck number");
		}
		
		sc.close();
		
	}

}
