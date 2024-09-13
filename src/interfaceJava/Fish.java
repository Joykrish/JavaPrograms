package interfaceJava;

public class Fish extends Animal  {
	
	Fish(String color, int weightInPound, int age) {
		super(color, weightInPound, age);
		// TODO Auto-generated constructor stub
	}

	public void swimm() {
		System.out.println("Fish Swim");
	}

	@Override
	public void move() {
		System.out.println("Fish is swimming");
	}

}
