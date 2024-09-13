package string;

import java.util.Scanner;

public class Penultimateword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.nextLine();
		
		//String str="Hare Krishna Govinda Mukunda Radhe Gopal";
		
		String[] arr=str.split(" ");
		System.out.println("Penultimate Word is "+arr[arr.length-2]);
	}
	

}
