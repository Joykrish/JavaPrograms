package javaExersize;

public class SwapWithandWithouttemp {

	public static void main(String[] args) {
		//swapwithtemp(10, 20);
		swapwithouttemp(10, 20);
		

	}

	public static void swapwithtemp(int a, int b) {
		int temp;
		//a=temp;
		a=b;
		temp=b;
		System.out.println(a);
		System.out.println(b);
		

	}

	public static void swapwithouttemp(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
		

	}

}
