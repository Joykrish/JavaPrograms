package packageThree;

public class Test {
	public int publicvariable=10;
	private int privateVariable=20;
	protected int protectedVariable=30;
	int defaultVariable=40;
	
	public static void main(String[] args) {
		Test ts=new Test();
		System.out.println(ts.publicvariable);
		System.out.println(ts.privateVariable);
		System.out.println(ts.protectedVariable);
		System.out.println(ts.defaultVariable);
	}

}
