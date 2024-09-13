package consturctorPractice;

public class ConstructorChainingP {
	
	public ConstructorChainingP() {
		
		this(10);
		
	}
	
public ConstructorChainingP(int i) {
	this("java");
	System.out.println(i);
	
		
	}

public ConstructorChainingP(String s) {
	System.out.println(s);
}
	
	public static void main(String[] args) {
		ConstructorChainingP cs=new ConstructorChainingP();
		
		
	}

}
