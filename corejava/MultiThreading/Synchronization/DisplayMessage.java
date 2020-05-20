package Synchronization;

//we'll create sayHello method. give name as a parameter, we'll print "Hello! " and print 4 times the name before it goes to next thread
public class DisplayMessage {
	public synchronized  void sayHello(String name) {
		for (int i = 1; i <= 4; i++) {
			System.out.println("Hello! " + name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
