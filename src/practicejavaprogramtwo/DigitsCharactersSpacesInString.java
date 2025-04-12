package practicejavaprogramtwo;

import java.util.Scanner;

public class DigitsCharactersSpacesInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plese enter the sentance to check");

		String str = sc.nextLine();
		
		sc.close();
		char[] arr = str.toCharArray();

		int digit = 0;
		int letter = 0;
		int spaces = 0;
		int other=0;

		for (char c : arr) {
			if (Character.isDigit(c)) {

				digit++;
			} else if (Character.isLetter(c)) {
				letter++;
			} else if (Character.isSpaceChar(c)) {
				spaces++;
			}
			else  {
				other++;
			}
		}
		
		System.out.println("Number of digits:"+digit);
		System.out.println("Number of Letters:"+letter);
		System.out.println("Number of Spaces:"+spaces);
		System.out.println("Number of Other characters:"+other);
		

	}

}
