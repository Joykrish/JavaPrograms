package practicejavaprogramsone;

import java.util.Scanner;

public class PatternInvertedTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int num=sc.nextInt();
		for(int i=0;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
