package practice.ClassExplaination;


class Shape{
	int length=10;
	int width=20;
	
	public void area() {
		System.out.println("Area");
	}
	
	public void perimeter() {
		System.out.println("Perimeter");
	}
	
}

class square extends Shape{
	int side=5;
	public void printSide() {
		System.out.println("Side Required");
	}
	
}
public class InheritanceShape {
	
	public static void main(String[ ]args) {
		square sv=new square();
		sv.area();
		sv.perimeter();
		System.out.println(sv.length);
		System.out.println(sv.width);
		
		
		Shape sh=new square();
	
		
		
	}

}
