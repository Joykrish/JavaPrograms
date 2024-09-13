package practice;

import java.util.Scanner;

public class FirstOccuranceOfArrayElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 5, 3, 2 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int number = sc.nextInt();
		sc.close();

		boolean isFound = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				System.out.println("number found at index: " + i);
				isFound = true;
				break;

			}
		}

		if (!isFound) {
			System.out.println("No number found");

		}

	}

}
