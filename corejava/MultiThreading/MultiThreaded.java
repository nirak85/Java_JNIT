
public class MultiThreaded extends Thread {
public static void main(String[] args) {
	MultiThreaded mt = new MultiThreaded();
	mt.start();
	// we need to invoke the start method which will in turn create a thread space for this thread and it will invoke the run method internally 
	// when we invoke the run method JVM will create a separate thread and it will invoke the run thread of our thread class
	for(int a=0; a<=50; a++){
		System.out.print("a: "+a+"\t");
	}
}
public void run(){
	for(int i=0; i<=50; i++){
		System.out.print("i: " +i+"\t");
}
}
}
