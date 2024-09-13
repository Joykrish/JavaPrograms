package youtubepractice;

public class FactorialOfNumber {
	public static void main(String[] args) {
		System.out.println(findFactorial(5));
	}
	
	public static int  findFactorial(int num) {
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial=factorial*i;
		}
		
		return factorial;
		
	}

}
