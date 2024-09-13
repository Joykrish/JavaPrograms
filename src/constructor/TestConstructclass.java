package constructor;

public class TestConstructclass {
	public static void main(String[] args) {
		ContructorClass cl=new ContructorClass();
		System.out.println(cl.instanceVaribleone);
		System.out.println(cl.instanceVaribletwo);
		
		ContructorClass onj2=new ContructorClass(101,"Krishna");
		System.out.println(onj2.instanceVaribleone);
		System.out.println(onj2.instanceVaribletwo);
	}

}
