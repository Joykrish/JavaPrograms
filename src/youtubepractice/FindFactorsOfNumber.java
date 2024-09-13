package youtubepractice;

import java.util.Scanner;

public class FindFactorsOfNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number for which factors  are to be found");
		
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}

}
