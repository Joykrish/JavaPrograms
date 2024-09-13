package constructor;

public class Dog extends Animal {
	
	Dog(int count){
		System.out.println("Constructor is of Dog" + count);
	}
	public void sound() {
		System.out.println("Dog make sound");
	}

}
