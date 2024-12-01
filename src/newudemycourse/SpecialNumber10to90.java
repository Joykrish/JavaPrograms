package newudemycourse;

public class SpecialNumber10to90 {

	public static void main(String[] args) {
		int i = 10;

		while (i <= 90) {
			i++;

			if (specialTwoDigitsNumber(i) == i) {
				System.out.println(i + " ");
			}
		}
	}

	static int specialTwoDigitsNumber(int num) {

		int digit1, digit2;
		digit1 = num % 10;
		digit2 = num / 10;

		return (digit1 * digit2) + (digit1 + digit2);

	}

}
