package youtubepractice;

public class FirstDigitLastDigitandSum {
	
	public static void main(String[] args) {
		int num=81232345;
		
		int firstDigit=0;
		
		int lastDigit=num%10;
		
		while(num>10) {
	
			num=num/10;
		
			
		}
		firstDigit=num;
		
		System.out.println(firstDigit);
		System.out.println(lastDigit);
		System.out.println("Sum is "+(firstDigit+lastDigit));
		
		
		
	}

}
