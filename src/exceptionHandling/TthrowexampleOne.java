package exceptionHandling;

public class TthrowexampleOne {

	public int substractBy10(int number) throws Exception {
		if (number > 10) {
			return number - 10;
		} else {
			throw new Exception(" Number is less than 10 ");
		}

	}
}


