package javaExersize;

public class FactorialRecursion {
	
	public static void main(String[] args) {
		int number=4;
		
		System.out.println(factorial(number));
	}
	
	public static int factorial(int n) {
		
		if(n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
		
	}

}
