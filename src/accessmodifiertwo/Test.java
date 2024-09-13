package accessmodifiertwo;

import accessmodifierone.ClassA;

public class Test extends ClassA {
	
	public static void main(String[] args) {
		ClassA a=new ClassA();
		a.showClassA();
			
//		ClassB b=new ClassB();
//		b.showClassB();
		
		Test obj=new Test();
		System.out.println(obj.privateVariable);
		System.out.println(obj.publicVariable);
		System.out.println(obj.protectedVariable);
		System.out.println(obj.defaultVariable);
		
		
	}
	
	

}
