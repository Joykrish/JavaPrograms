package interfaceJava;

public class Birds extends Animal {
Birds(String color, int weightInPound, int age) {
		super(color, weightInPound, age);
		// TODO Auto-generated constructor stub
	}

public void fly() {
	System.out.println("Animal fly");
}

@Override
public void move() {
	System.out.println("Birds are flying");
	
}
	
}
