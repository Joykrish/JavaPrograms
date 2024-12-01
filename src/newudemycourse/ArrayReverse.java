package newudemycourse;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array Size");
		int size=sc.nextInt();
		
		System.out.println("Enter the array elements");
		int [] arr=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
				
		
		 
		 int [] reverse=new int [arr.length];
		 
		 for(int i=0,j=arr.length-1;i<arr.length;i++,j--) {
			 
			 reverse[j]=arr[i];
		 }
		 
		 System.out.println(Arrays.toString(reverse));
		 
		 sc.close();
	}

}
