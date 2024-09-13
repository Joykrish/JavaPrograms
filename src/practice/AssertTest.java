package practice;

import java.util.Scanner;

public class AssertTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		try {
		assert age>=18:"Not valid Age";
		}
		catch(AssertionError a) {
			System.out.println(" Age is not valid");
		}
		System.out.println("Value is "+age);
	}

}
