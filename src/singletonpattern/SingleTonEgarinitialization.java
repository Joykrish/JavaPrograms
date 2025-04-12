package singletonpattern;

public class SingleTonEgarinitialization {
	
	private static final SingleTonEgarinitialization singleTonEgarinitialization=new SingleTonEgarinitialization();

	private SingleTonEgarinitialization() {
		
	}
	
	public static SingleTonEgarinitialization getInstance() {
		return singleTonEgarinitialization;
	}
	
	public void show() {
		System.out.println("Message to enter");
	}
	
}
//✅ Fast and thread-safe, since the instance is created at class loading.
//❌ Memory wastage if the instance is never used.