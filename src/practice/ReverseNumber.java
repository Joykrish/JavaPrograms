package practice;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 12345;

		System.out.println(reverseNumber(num));

	}

	public static int reverseNumber(int num) {

		int reverse = 0;
		while (num > 0) {

			reverse = reverse * 10 + num % 10;
			num = num / 10;

		}
		return reverse;

	}

}
