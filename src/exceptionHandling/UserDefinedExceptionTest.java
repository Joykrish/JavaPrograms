package exceptionHandling;

public class UserDefinedExceptionTest extends Exception {
	
	
	public UserDefinedExceptionTest(String message) {
		super(message);
	}
	
	public UserDefinedExceptionTest() {
		super();
	}
	
	

}
