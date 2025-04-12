package practicejavaprogramsone;

import java.util.Scanner;

public class CountDigitsNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		

		int num = sc.nextInt();
		System.out.println("Enter the required digit:");
		int digit=sc.nextInt();

		int count = 0;

		while (num > 0) {
			int reminder = num % 10;
			if(reminder==digit) {
			count++;
			}
			num = num / 10;

		}

		System.out.println(count);
		sc.close();
	}

}
