package practice;

public class FirstDigitLastDigit {
	
	public static void main(String[] args) {
		int number=212345;
		int firstDigit=0;
		int lastDigit=0;
		
		lastDigit=number%10;
		firstDigit=number;
		while(firstDigit>10) {
			firstDigit=firstDigit/10;
		}
		System.out.println(lastDigit);
		System.out.println(firstDigit);
		System.out.println(lastDigit+firstDigit);
		
	}

}
