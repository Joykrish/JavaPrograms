package youtubepractice;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		int [] arr=new int[5];
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
	System.out.println("Enter the location where do you want to enter");
	int location=sc.nextInt();
	System.out.println("Enter the value where do you want to enter");
	int value=sc.nextInt();
	
	for(int i=arr.length-1;i>location;i--) {
		arr[i]=arr[i-1];
	}
		arr[location]=value; 
		System.out.println("After inserting new value "+ Arrays.toString(arr));
		
	}
	
	

}
