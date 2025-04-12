 package practicejavaprogramtwo;

public class SwapwithoutTemp {
	public static void main(String[] args) {
		int a=30;
		int b=20;
		swap2(a,b);
	
	}
	
	
	public static void swap1(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b); 
		
	}
	
	public static void swap2(int a,int b) {
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}

}
