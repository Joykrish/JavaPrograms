package multiThreadingUdemy;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sequence seq=new Sequence();
		worker worker1=new worker(seq);
		worker1.start();
		worker worker2=new worker(seq);
		worker2.start();
		 

	}

}

class worker extends Thread{
	
	Sequence sequence=null;
	public worker(Sequence sequence) {
		
		this.sequence=sequence;
		
	}
	
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+ "got value "+sequence.getNext());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
