package practicejavaprogramsone;

import java.util.Scanner;

public class ArrayMiniPicks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array Size");
		int size = sc.nextInt();

		System.out.println("Enter the array elements");
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
				System.out.println(arr[i]);
			}
		}
	}

}
