package consturctorPractice;

public class ChildC extends ParentClass  {
	int i=100;
	
	public ChildC() {
		super(10);
		System.out.println("Consturctor with child Class");
	}
	
	
	public void add() {
		System.out.println("Add method of Child class");
		super.add();
		System.out.println(this.i);
		System.out.println(super.i);
	}
	public static void main(String[] args) {
		ChildC c=new ChildC();
		c.add();
	}
	

}
