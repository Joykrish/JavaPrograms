package youtubepractice;

import java.util.Scanner;

public class PrintNevenNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Please enter the number ");
	
	int num=sc.nextInt();
	
	for(int i=2;i<=num;i=i+2) {
		System.out.println(i);
	}
}
}
