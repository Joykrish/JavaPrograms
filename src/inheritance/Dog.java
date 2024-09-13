package inheritance;

public class Dog extends Animal{
	public static void main(String[] args) {
		Dog dg=new Dog();
		//Animal dg=new Animal();
		dg.sound();
	}

	public void sound() {
		System.out.println("Dog sound");
	}
}
 