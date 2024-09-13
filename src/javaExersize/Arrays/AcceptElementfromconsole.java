package javaExersize.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AcceptElementfromconsole {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of size");
	int n=sc.nextInt();
	
	int [] arr=new int[n];
	
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(arr));
}
}
