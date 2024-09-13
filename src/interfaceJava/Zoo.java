package interfaceJava;

public class Zoo {
	public static void main(String[] args) {
		//Animal an=new Animal("black",25,5);
		
	//	an.eat();
		
		
		Animal fish=new Parrot("Silver",5,2);
		fish.eat();
		fish.move();
		
		Animal birds=new Birds("gold",6,7);
//		Parrot ck=new Parrot("Gray",3,1);
//		ck.fly();
//		fish.move();
//		
//		Birds bd=new Birds("White",3,1);
//		bd.move();
		
		moveAnimal(fish);
		moveAnimal(birds);
		
		Flyable fb=new Parrot("gold",6,7);
		fb.fly();
		
		
	}  
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}
	
	
	

}
