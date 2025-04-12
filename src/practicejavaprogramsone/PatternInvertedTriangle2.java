package practicejavaprogramsone;

import java.util.Scanner;

public class PatternInvertedTriangle2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int num=sc.nextInt();
		for(int i=num;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("@"+" ");
			}
			System.out.println();
		}
		
	}

}
