package newudemycourse;

import java.util.Scanner;

public class CheckNivenNumber {
	
	
	public static int sumOfnumber(int num) {
		
		int sum=0;
		while(num!=0) {
			int reminder=num%10;
			sum=sum+reminder;
			num=num/10;
		}
		
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int num1=num;
		
		
		System.out.println((num1%sumOfnumber(num)==0?"Niven number":"Not Niven number")); 
		sc.close();
		
	}

}
