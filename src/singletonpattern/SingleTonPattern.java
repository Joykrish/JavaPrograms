package singletonpattern;

public class SingleTonPattern {
	
	private static SingleTonPattern singleTonInstance;
	
	//private construction to instantiation from outside
	private SingleTonPattern() {
		
	}
	
	public static synchronized SingleTonPattern getInstance() {
		if(singleTonInstance==null) {
			singleTonInstance= new SingleTonPattern();
		}
		return singleTonInstance;
		
	}
	
	public void showMessage() {
		System.out.println("Hello from singleTon");
	}

}
//private static Singleton instance; → Holds the single instance.
//✅ private Singleton() { } → Prevents object creation from outside.
//✅ public static synchronized Singleton getInstance() → Ensures only one instance is created.
//✅ synchronized → Makes it thread-safe, but can slow performance.