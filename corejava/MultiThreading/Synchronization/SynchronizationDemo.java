package Synchronization;
 //this is a main method. we'll share the DisplayMessage instance across those two thread to see synchronization in action
public class SynchronizationDemo {

	public static void main(String[] args) {
		DisplayMessage dm= new DisplayMessage();
		
		MyThread mt=new MyThread(dm, "Yogen");
		MyThread mt1=new MyThread(dm, "Niraj");
		
		mt.start();
		mt1.start();
	}

}
