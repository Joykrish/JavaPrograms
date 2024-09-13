package polymorphism;

public class Child extends Parent{
	
	
	public void hide() {
		
	}
	
	public static void showHide() {
		System.out.println("ShowHide from child");
		
	}
	
	public static void main(String[] args) {
		Parent c=new Child();
		c.show();
		//c.hide();
		c.showHide();
		
		
	}
}
