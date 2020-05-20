package Threadcommunication;

//in this class we're going to create thread that should calculate the sum of numbers from 1 to 11.
//but the result should display by the main method
//so the main thread need to communicate with the child thread and see if it had finished its calculation and only then display the results.
public class MyThread extends Thread {
	int total;

	@Override
	public void run() {
		System.out.println("Child Thread is calculating the sum: ");

		synchronized (this) {
			for (int i = 1; i < 12; i++) {
				total += i;
			}
			this.notify();
		}
	}
}
