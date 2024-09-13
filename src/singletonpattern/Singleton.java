package singletonpattern;

public class Singleton {
	
	private static Singleton instance=new Singleton();
	private Singleton(){
		System.out.println("Creating objects");
		
	}
	
	
	public static Singleton getInstance() {
		//return new Singleton();
		
		  return instance;
		
	}
	

}
