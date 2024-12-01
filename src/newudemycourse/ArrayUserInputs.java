package newudemycourse;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserInputs {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array size");
		
		int arraySize=sc.nextInt();
		
		int[] arr=new int[arraySize];
		System.out.println("Enter array elements");
		
		for(int i=0;i<arraySize;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
