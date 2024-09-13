package multithreading;

public class ThreadDemo2 {
	public static void main(String[] args) {
		MyThreadUsingRunnable obj=new MyThreadUsingRunnable();
		Thread s1=new Thread(obj);
		s1.setName("First");
		s1.start();
		
		for (int i=0;i<=10;i++) {
			System.out.println(" Main Thread: "+Thread.currentThread().getName());
		}
	}
	
	

}
