package practice;

public class MultiplyCorrespondingElement {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = { 11, 22, 33, 44, 55, 66,77 };

		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				int multiply = a[i] * b[i];
				System.out.println("Multiplication of " + a[i] + " and " + b[i] + " is " + multiply);
			}
		}
		else {
			System.out.println("Two arrays should be of same length");
		}
	}

}
