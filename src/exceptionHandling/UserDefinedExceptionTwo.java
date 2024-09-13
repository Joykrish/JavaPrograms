package exceptionHandling;

public class UserDefinedExceptionTwo {
	public int substractBy10(int number) throws UserDefinedException {
		if (number > 10) {
			return number - 10;
		} else {
			throw new UserDefinedException(" Number is less than 10 ");
		}

	}
}
