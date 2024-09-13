package practice.ClassExplaination;

class Cat{
	int eye=2;
	int tail=1;
	public void jump() {
		System.out.println("Cat Jump!");
	}
	
	public void eatMice() {
		System.out.println("Cat loves to eat mice!");
	}
	public void drinkMilk() {
		System.out.println("Cat drinks  the milk while you are away!!!!");
	}
}
public class CatTest {

	public static void main(String[] args) {
		Cat obj=new Cat();
		System.out.println(obj);
		obj.jump();
		obj.eatMice();
		obj.drinkMilk();

	}

}
