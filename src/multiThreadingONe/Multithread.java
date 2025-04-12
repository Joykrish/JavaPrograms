package multiThreadingONe;

class MultithredingDemo1 implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}

	}

}

public class Multithread {
	public static void main(String[] args) {
		int n = 8;
		for (int i = 0; i < n; i++) {
			Thread tr = new Thread(new MultithredingDemo1());
			tr.start();
		}

	}

}
