package collections;

public class AutoBoxing {
	
	public static void main(String[] args) {
		int var=10;
		Integer obj=new Integer(var);
		
		System.out.println(obj);//wrapping---Autoboxing
		
		int i=obj;//unwrapping
		
		System.out.println(i);//Autounboxing
		
		
	}

}
