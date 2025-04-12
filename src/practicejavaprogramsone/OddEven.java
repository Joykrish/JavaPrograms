package practicejavaprogramsone;

import java.util.Scanner;

public class OddEven {
	public static void main(String [] args) throws Exception {
		
		try(Scanner sc=new Scanner(System.in);){
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		
		if(num<=0) {
			throw new IllegalArgumentException ("Please enter number greater than 0");
		}
		else {
		
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("ODD");
		}
	}

}
		}
}  