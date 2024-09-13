package practice;

import java.util.Scanner;

public class FindAverageOfInput6Numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int numberone=sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int numberTwo=sc.nextInt();
		System.out.println("Enter 3nd Number:");
		int numberThree=sc.nextInt();
		System.out.println("Enter 4nd Number:");
		int numberFour=sc.nextInt();
		System.out.println("Enter 5nd Number:");
		int numberFive=sc.nextInt();
		System.out.println("Enter 6nd Number:");
		int numberSix=sc.nextInt();
		sc.close();
		
		System.out.println("Average of Number is: "+(numberone+numberTwo+numberThree+numberFour+numberFive+numberSix)/6.0);
	}

}
