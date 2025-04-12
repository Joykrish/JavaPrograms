package multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread td=new MyThread();
		MyThread td1=new MyThread();
		td.setName("First");
		td1.setName("Second");
		td.start();
		
		td1.start();
		
		for (int i=0;i<=10;i++) {
			System.out.println(" Main Thread: "+Thread.currentThread().getName());
		}

	}

}
 