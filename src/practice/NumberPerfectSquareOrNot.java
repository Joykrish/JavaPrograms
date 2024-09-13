package practice;

public class NumberPerfectSquareOrNot {

	public static void main(String[] args) {
		int num = 9;
		boolean result = false;
		for (int i = 1; i <= num/2; i++) {
			if (i * i == num) {
				result = true;

				break;
			}

		}
		System.out.println("Number is perfect square: " + result);
	}

}
