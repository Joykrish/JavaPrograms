package practice;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementArrayInSpecificPosition {

	public static void main(String[] args) {

		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in array");
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter the location where you want to enter");
		int indexlocation = sc.nextInt();
		System.out.println("Enter the value  you want to enter");
		int value = sc.nextInt();

		for (int i = arr.length - 1; i > indexlocation; i--) {
			arr[i] = arr[i - 1];

		}
		arr[indexlocation] = value;
		System.out.println(Arrays.toString(arr));
 	}

}
