package thread.life.cycle;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");

        try {
            Thread.sleep(1000); // Goes to Timed Waiting state
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread execution finished");
    }
}  

public class ThreadLifeCycleExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // New state

        System.out.println("Thread is in NEW state.");
        t1.start(); // Runnable state

        System.out.println("Thread is in RUNNABLE state.");

        try {
            t1.join(); // Main thread waits (Timed Waiting state)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread is in TERMINATED state.");
    }
}
