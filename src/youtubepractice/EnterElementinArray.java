package youtubepractice;

import java.util.Arrays;
import java.util.Scanner;

public class EnterElementinArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		
		int arrsize=sc.nextInt();
		
		int [] arr=new int[arrsize];
		
		for(int i=0;i<arrsize-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		int sum=0;
		for(int a:arr) {
			sum=sum+a;
			
		}
		
		System.out.println("Total of elements in array is"+sum);
	}

}
