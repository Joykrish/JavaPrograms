package singletonpattern;

public class SingletonDoubleCheckedLocking {
	//Reduces the overhead of synchronized, improving performance.
	//Ensures thread safety without synchronizing every call to getInstance().

	private static volatile  SingletonDoubleCheckedLocking instance;

	private SingletonDoubleCheckedLocking() {

	}

	public static SingletonDoubleCheckedLocking getInstance() {
		if (instance == null) {
			synchronized (SingletonDoubleCheckedLocking.class) {
				if (instance == null) {
					instance = new SingletonDoubleCheckedLocking();
				}
			}
		}
		return instance;
	}
	
	public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

}
