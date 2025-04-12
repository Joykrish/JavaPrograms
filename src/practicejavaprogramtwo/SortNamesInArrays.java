package practicejavaprogramtwo;

import java.util.Arrays;
import java.util.Scanner;

public class SortNamesInArrays {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=sc.nextInt();
		String [] arr=new String[size];
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the elements of array");
		
		for(int i=0;i<size;i++) {
			arr[i]=sc1.nextLine();
		}
	

	for(int i=0;i<size;i++) {
		for(int j=i+1;j<size;j++) {
			if(arr[i].compareTo(arr[j])>0) {
				String temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			
		}
		
	}
	System.out.println(Arrays.toString(arr));
}
}
