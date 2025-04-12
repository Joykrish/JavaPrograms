package practicejavaprogramsone;

import java.util.Scanner;

public class ArmstorngNumberCheck {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int temp=num;
		int sum=0;
		while(temp!=0) {
			int reminder=temp%10;
			sum=sum+(reminder*reminder*reminder);
			temp=temp/10;
		}
		sc.close();
		System.out.println(num==sum?"Armstrong Number":"No argmstrong Number");
	}

}
