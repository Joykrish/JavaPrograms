package practice;

import java.util.Stack;

public class ReverseNumber3ways {

	public static void main(String[] args) {

		int number = 123457;

		// reverseOne(number);
		// reverseTwo(number);
		// reverseThree(number);
		reverseFour(number);

	}

	public static void reverseOne(int number) {
		int rev = 0;

		while (number > 0) {
			rev = number % 10 + rev * 10;

			number = number / 10;

		}

		System.out.println("reverse is " + rev);
	}

	public static void reverseTwo(int number) {
		StringBuffer stBuffer = new StringBuffer(String.valueOf(number));
		stBuffer.reverse();
		System.out.println("reverse is " + stBuffer);
	}

	public static void reverseThree(int number) {
		StringBuilder stBuilder = new StringBuilder();
		stBuilder.append(number);
		stBuilder.reverse();
		System.out.println("reverse is " + stBuilder);
	}

	public static void reverseFour(int number) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < String.valueOf(number).length(); i++) {
			st.push(String.valueOf(number).charAt(i));

		}
		while(!st.isEmpty()) {
			char u=st.pop();
			sb.append(u);

		}
System.out.println("Reverse is "+sb);
	}

}
