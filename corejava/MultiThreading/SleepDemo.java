
public class SleepDemo extends Thread {
public static void main(String[] args) throws InterruptedException {
	SleepDemo mt = new SleepDemo();
	mt.start();
	 
	for(int a=0; a<=50; a++){
		System.out.print("a: "+a+"\t");
		Thread.sleep(2000);   //sleep here is 1000millisec= 1sec
	}
}
public void run(){
	for(int i=0; i<=50; i++){
		System.out.print("i: " +i+"\t");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("child thread existing");
		}
		
}
}
}
