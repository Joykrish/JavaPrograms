package exceptionHandling;

public class Throwableexampletwo {
	public static void main(String[] args)  {
		
		UserDefinedExceptionTwo tw=new UserDefinedExceptionTwo();
		TthrowexampleOne ob=new TthrowexampleOne();
		try {
			System.out.println(tw.substractBy10(5));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
