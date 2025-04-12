package exceptionHandling;

public class ExceptionRecentONe {
	
	
	public static void main(String[] args) {
		try {
			testException(190);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void testException(int age) {
		
		if(age<16) {
			throw new ArithmeticException("Age should be greater than 16");
		}
		System.out.println("Congratulations you are good  to go!!");
	}

}
