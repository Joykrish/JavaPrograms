package javaExersize;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int num=12345;
		
		int rev=0;
		
		
		while (num>0) {
			int remider=num%10;
			rev=rev*10+remider;
			num=num/10;
		}
		System.out.println("reverse is  "+rev);
	}

}
