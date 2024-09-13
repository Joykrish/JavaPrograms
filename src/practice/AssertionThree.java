package practice;

import java.util.Scanner;

public class AssertionThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of years use worked on: ");
		int years = sc.nextInt();
		try {
			assert years >= 5 : "Assertion error has  thrown";
		} catch (AssertionError e) {
			e.printStackTrace();
			return;
		}
		System.out.println("10% bonus  calculation ");

	}

}
