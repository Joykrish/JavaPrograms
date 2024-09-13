package multiThreadingUdemy;

public class RunnableInterface {
	public static void main(String[] args) {
		System.out.println("Hare Rama");

		Thread t1 = new Thread(new Task("Thread-A"));
		t1.start();

		System.out.println("Hare Krishna");

		Thread t2 = new Thread(new Task("Thread-B"));
		t2.start();
	}
}

class TaskOne implements Runnable {
	String name;

	public TaskOne(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		Thread.currentThread().setName(this.name);
		for (int i = 0; i < 100; i++) {
			System.out.println("Value of i is " + i + " " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
