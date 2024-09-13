package practice;

import java.util.Scanner;

public class Penultimateword {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		sc.close();
		
		String[] arr=s.split(" ");
		
		if(arr.length>1) {
			System.out.println("Penaultimate word is: "+arr[arr.length-2]);
		}else {
			System.out.println("Given statement has less than two words so Penaultimate word not found");
		}
		
		
	}

}
