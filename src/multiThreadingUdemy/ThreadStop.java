package multiThreadingUdemy;

public class ThreadStop extends Thread {
	
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName());
			}
			catch(InterruptedException e) {
				System.out.println(e);
				
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ThreadStop t1=new ThreadStop();
		ThreadStop t2=new ThreadStop();
		ThreadStop t3=new ThreadStop();
		t1.start();
		t2.start();
		t3.stop();
		System.out.println("Thread T3 is Stopped");
	}

}
