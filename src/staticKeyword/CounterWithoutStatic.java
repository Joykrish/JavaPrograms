package staticKeyword;

public class CounterWithoutStatic {
	int counter;
	
	CounterWithoutStatic(){
		counter ++;
		System.out.println(counter);
	}
	
	public static void main(String[] args) {
		CounterWithoutStatic c1=new CounterWithoutStatic();
		CounterWithoutStatic c2=new CounterWithoutStatic();
		CounterWithoutStatic c3=new CounterWithoutStatic();
	}
}
