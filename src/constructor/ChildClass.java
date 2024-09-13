package constructor;

public class ChildClass extends ParentClass{
	


int i=150;

public ChildClass(){
	super(10);
	System.out.println("Child Class constructor");
}
	
	public void  add() {
		System.out.println("Add method of Child class");
		super.add();
		System.out.println(this.i);
		System.out.println(super.i);
	}

	public static void main(String[] args) {
		ChildClass ch=new ChildClass();
		ch.add();
	}
}
