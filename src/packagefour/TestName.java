package packagefour;

import packageThree.Test;

public class TestName extends Test{
	public static void main(String[] args) {
		Test ts=new Test();
		System.out.println(ts.publicvariable);
		System.out.println(ts.privateVariable);
		System.out.println(ts.protectedVariable);
		System.out.println(ts.defaultVariable);
		
		TestName ts1=new TestName();
		System.out.println(ts1.protectedVariable);
		System.out.println(ts1.publicvariable);
		System.out.println(ts1.defaultVariable);
		System.out.println(ts1.privateVariable);
		
	}

}
