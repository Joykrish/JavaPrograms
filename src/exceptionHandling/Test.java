package exceptionHandling;

public class Test {
	public static void main(String[] args) throws MyException {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		//System.out.println(5/0);
		System.out.println(6);
		//Thread.sleep(5000);
		try {
			MyException.show(10); 
			System.out.println("Into try block");
		} 
		catch (ArithmeticException e) {
			System.out.println("Into catch exception");
			// TODO: handle exception
		}
		catch (MyException e) {
			System.out.println("Into catch");
			
			try {
				MyException.show(10);
				System.out.println("Into sub  try block");
			} 
			catch (MyException j) {
				System.out.println("Into sub catch");}
			catch (ArithmeticException i) {
				System.out.println("Into catch exception");
				// TODO: handle exception
			}
			// TODO: handle exception
		}
		 
		finally {
			System.out.println("Into finally");
		}
		
		
	}
	
	public void devideTwoValues(int a,int b) {
		System.out.println(a/b);
		
	}

}
