
public class PriorityThread extends Thread{
	public static void main(String[] args) throws Exception{
		PriorityThread A= new PriorityThread();
		A.setPriority(MIN_PRIORITY);
		A.setName("Coke");
		A.start();
		
		PriorityThread B= new PriorityThread();
		B.setPriority(MAX_PRIORITY);
		B.setName("Dr.pepper");
		B.start();
	}
	public void run(){
		System.out.println("Thread Name: "+ Thread.currentThread().getName());
	} 
}
