package multithreading;

public class SyncIssue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home h=new Home();
		ABC t1=new ABC(h,"Hare");
		t1.start();
		t1.i=10;
		 t1.threadlocal.set("Radhe");
		System.out.println("Value of i thread one  is"+t1.i);
		System.out.println("Printing for thread local first"+t1.threadlocal.get());
		ABC t2=new ABC(h,"Krishna");
		t2.start();
		System.out.println("Value of i is for thread two"+t2.i);
		System.out.println("Printing for thread local second"+t2.threadlocal.get());

	}

}
