package practicejavaprogramtwo;

public class SumOfDigitsOfNumber {
	public static void main(String[] args) {
		int num=123;
		
		int sumOfDigits=0;
		
		while(num>0) {
			int digit=num%10;
			sumOfDigits=sumOfDigits+digit;
			num=num/10;
		}
		
		System.out.println("Sum of Digits is: "+sumOfDigits);
	}

}
