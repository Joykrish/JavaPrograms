package youtubepractice;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the numer");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
