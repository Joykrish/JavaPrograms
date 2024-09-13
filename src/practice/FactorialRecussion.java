package practice;

public class FactorialRecussion {
	public static int findFactorial(int n) {
		if(n<=1)
			return 1;
		else
			return n*findFactorial(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println("Factorial of "+n+"is ="+findFactorial(n));

	
	}

}
