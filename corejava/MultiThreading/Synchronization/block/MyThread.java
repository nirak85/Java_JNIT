package Synchronization.block;

//we'll create the thread class to use the DisplayMessage object.
public class MyThread extends Thread {

	DisplayMessage dm;
	String name;

	// creating a constructor
	MyThread(DisplayMessage dm, String name) {

		this.dm = dm;
		this.name = name;
	}

	public void run() {
		dm.sayHello(name);
	}
}
