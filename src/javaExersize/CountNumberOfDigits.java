package javaExersize;

public class CountNumberOfDigits {
	
	public static void main(String[] args) {
		int num=1234356;
		int count=0;
		
		while(num>0) {
			int reminder=num%10;
			count++;
			num=num/10;
		}
		System.out.println("Digit Count is "+count);
	}

}
