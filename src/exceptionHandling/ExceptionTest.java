package exceptionHandling;

import java.util.Scanner;

public class ExceptionTest  {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int userInput=sc.nextInt();
		int number=10;
		int result = 0;
		//one way
		if(userInput%2==0) {
			System.out.println("Even number");
		}
		else {
			throw new UserDefinedExceptionTest("Number is odd");
		}
	
		
		//another way
		try {
			System.out.println(number/userInput);
			
		} catch (Exception e) {
			throw new UserDefinedExceptionTest("Number is not correct");
		
			
		}
		
		
		
	
	}

}
