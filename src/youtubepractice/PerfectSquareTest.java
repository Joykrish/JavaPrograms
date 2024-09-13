package youtubepractice;

import java.util.Scanner;

public class PerfectSquareTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number to be verified");
		boolean IsPerfectSquare=false;
		int num=sc.nextInt();
		
		for(int i=1;i<=num/2;i++) {
			if(i*i==num) {
				IsPerfectSquare=true;
				break;
			}
			
		}
		
		System.out.println("Number is perfect square: "+IsPerfectSquare);
		
	}

}
