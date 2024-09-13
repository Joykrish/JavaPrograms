package interfaceJava;

public class Parrot extends Birds implements Flyable{

	Parrot(String color, int weightInPound, int age) {
		super(color, weightInPound, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Parrot Flies high");
		
	}
	
//	public void fly() {
//		System.out.println("Parrot can  fly.....");
//	}

}
