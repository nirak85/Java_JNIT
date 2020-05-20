package Threadcommunication;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {

		MyThread mt = new MyThread();
		mt.start();

		synchronized (mt) {
			System.out.println("Main thread is going to wait.");
			mt.wait(); // this thread going to wait until the child thread finish
						
			System.out.println("Main Thread Notify");
			System.out.println(mt.total);

		}
	}

}
