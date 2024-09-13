package generics;

public class GenericClassExample<T extends Object> {
	
	T oj;  
	
	
	public GenericClassExample(T oj) {
		this.oj=oj;
	}
	public GenericClassExample() {
		
	}
	
	public void show() {
		System.out.println("Type of Object is: "+oj.getClass().getName());
	}
	
	public T get() {
		return  this.oj;
	}

}
