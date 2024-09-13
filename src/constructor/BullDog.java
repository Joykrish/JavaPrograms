package constructor;

public class BullDog  extends Dog{
	
	BullDog(){
		super(10);
		System.out.println("Constructor of  BullDog");
	}
	
	public void sound() {
		super.sound();
		System.out.println("Bull Dog make sound");
	}


}
