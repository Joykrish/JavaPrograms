package practicejavaprogramtwo;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Java8IsPalinodrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number to be palinodromed");

		int number = sc.nextInt();
		sc.close();

		if (isPalinodrome(number)) {
			System.out.println("Number is Palinodrome");
		}

		else {
			System.out.println("Number is not Palinodrome");
		}

	}

	public static boolean isPalinodrome(int number) {
		String Originalnum = String.valueOf(number);
		String reverseString = IntStream.rangeClosed(1, Originalnum.length())
				.mapToObj(i -> Originalnum.charAt(Originalnum.length() - i))
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();

		return Originalnum.equals(reverseString);

	}

}
