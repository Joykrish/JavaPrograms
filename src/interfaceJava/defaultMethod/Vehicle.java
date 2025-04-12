package interfaceJava.defaultMethod;

public interface Vehicle {
default void driver() {
	System.out.println("Vehicles runs");
}
}

class Car implements Vehicle{
	
}

class Bike implements Vehicle{
	public void driver(){
		System.out.println("Bile runs");
	}
}