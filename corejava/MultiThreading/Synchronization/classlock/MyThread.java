package Synchronization.classlock;

//we'll create the thread class to use the DisplayMessage object.
public class MyThread extends Thread {

	String name;

	// creating a constructor
	MyThread(String name) {
		this.name = name;
	}

	public void run() {
	DisplayMessage.sayHello(name);
	}
}
