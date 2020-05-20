
public class CheckProfessor implements Runnable {

	@Override
	public void run(){
		System.out.println("Processed the checks");
		
	}
public static void main(String[] args) {
	
	CheckProfessor cp= new CheckProfessor();
	Thread t= new Thread(cp);
	t.start();
}
}
