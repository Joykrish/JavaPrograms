package constructor;

public class ConstructorChaining {
	public ConstructorChaining(){
		this(10);
	}
	
public ConstructorChaining(int i){
	this("java");
	System.out.println(i);
	
		
	}

public ConstructorChaining(String s){
	System.out.println(s);
}



	
public static void main(String[] args) {
	ConstructorChaining cs=new ConstructorChaining();
}
}
