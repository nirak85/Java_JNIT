package Synchronization.classlock;

//this is a main method. we'll share the DisplayMessage instance across those two thread to see synchronization in action
public class SynchronizationDemo {

	public static void main(String[] args) {
	
		
		MyThread mt=new MyThread("Yogen");
		MyThread mt1=new MyThread("Niraj");
		
		mt.start();
		mt1.start();
	}

}
 