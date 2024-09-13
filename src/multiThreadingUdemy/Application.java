package multiThreadingUdemy;

public class Application {

	public static void main(String[] args) {
		System.out.println("Hare Rama");
		Task taskRunner= new Task("Thread-A");
		taskRunner.start();
		System.out.println("Hare Krishna");
		Task taskRunner2= new Task("Thread-B");
		taskRunner2.start();
	}
	
	
}

class Task extends Thread{
	String name;
	
	public Task(String name) {
		this.name=name;
	}

	@Override
	public void run() {
		Thread.currentThread().setName(this.name);
		for(int i=0;i<100;i++) {
			System.out.println("Value of i is "+i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}