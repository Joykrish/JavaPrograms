package practicejavaprogramtwo;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int initialNumber=number;
		System.out.println("Enter the power");
		int power=sc.nextInt();
		sc.close();
		for(int i=1;i<power;i++) {
			number=initialNumber*number;
		}
		
		System.out.println(number);
	}

}
