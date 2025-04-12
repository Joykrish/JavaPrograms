package practicejavaprogramsone;

import java.util.Scanner;

public class PatternPascalRightAngleTriangleReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			for (int j = 0; j < num; j++) {
				if (j < num - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();

		}
		for (int i = num-1; i >= 1; i--) {
			for(int j=0;j<num;j++) {
				if (j < num - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();

		}
		
		
	}
}
