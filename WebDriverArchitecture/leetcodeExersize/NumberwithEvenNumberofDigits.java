package leetcodeExersize;

public class NumberwithEvenNumberofDigits {

	public static void main(String[] args) {

		int[] arr = { 12, 135, 2, 6, 1234 };
		System.out.println(countEven(arr));

	}

	public static int countEven(int[] arr) {
		int mainCount = 0;
		for (int num : arr) {
			int count = 0;
			while (num > 0) {

				num = num / 10;
				count++;

			}
			if (count % 2 == 0) {
				mainCount++;
			}
		}
		return mainCount;

	}
}
