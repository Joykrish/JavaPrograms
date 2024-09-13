package accessmodifierone;

class ClassB {
	
public void showClassB() {
		
	}

public static void main(String[] args) {
	ClassA obj=new ClassA();
	System.out.println(obj.privateVariable);
	System.out.println(obj.publicVariable);
	System.out.println(obj.protectedVariable);
	System.out.println(obj.defaultVariable);
}

}
