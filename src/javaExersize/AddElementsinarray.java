package javaExersize;

import java.util.Scanner;

public class AddElementsinarray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sum=0;
	
	System.out.println("Enter the size of the array ");
	int size=sc.nextInt();

	int[] arr=new int[size];
	
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	
	for(int a:arr) {
		sum=sum+a;
	}
	System.out.println(sum);
	
}
}
