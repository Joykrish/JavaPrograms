package exceptionHandling;

public class MyException extends Exception{
	
	
	public static void show(int i) throws MyException {
		if (i==10) {
			throw new MyException();
		}
		System.out.println(i);
	}

}
 