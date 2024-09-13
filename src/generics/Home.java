package generics;

public class Home {

	public<T extends Number> void m1(T ab) {
		
	}
public static void main(String[] args) {
	Home h=new Home();
	h.m1(10);
}
}
