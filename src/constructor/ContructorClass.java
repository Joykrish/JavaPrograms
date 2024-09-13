package constructor;

public class ContructorClass {
	public int instanceVaribleone;
	public String instanceVaribletwo;

	public ContructorClass() {
		System.out.println("Calling default constructor");

	}
	public ContructorClass(int i) {
		System.out.println(i);

	}
	public ContructorClass(int instanceVaribleone, String instanceVaribletwo) {
		
		this(15);
		this.instanceVaribleone=instanceVaribleone;
		
		this.instanceVaribletwo=instanceVaribletwo;
		System.out.println(this.instanceVaribleone);
		System.out.println(this.instanceVaribletwo);

	}
	public void testCOnstruct() {
		System.out.println("Test");
	}
	public static void main(String[] args) {
		
		ContructorClass onj2=new ContructorClass(101,"Krishna");
		
	
	}

}
