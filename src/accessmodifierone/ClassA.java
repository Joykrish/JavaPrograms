package accessmodifierone;

public class ClassA {
	
	private int privateVariable=10;
	public int publicVariable=20;
	protected int protectedVariable=30;
	int defaultVariable=40;
	public void showClassA() {
		
	}
	
	public static void main(String[] args) {
		ClassA obj=new ClassA();
		System.out.println(obj.privateVariable);
		System.out.println(obj.publicVariable);
		System.out.println(obj.protectedVariable);
		System.out.println(obj.defaultVariable);
		
	}

}
