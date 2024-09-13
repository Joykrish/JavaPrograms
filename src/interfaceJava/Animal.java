package interfaceJava;

public abstract class Animal {
	
	String color;
	int weightInPound;
	int age;
	
	Animal(String color,int weightInPound,int age){
		this.color=color;
		this.weightInPound=weightInPound;
		this.age=age;
		
	}
	public void eat() {
		System.out.println("Animal eat");
	}
	
	public void sleep() {
		System.out.println("Animal Sleep");
	}

	public abstract void move();
}
