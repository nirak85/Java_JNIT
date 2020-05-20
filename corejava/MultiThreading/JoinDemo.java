import java.util.Scanner;

public class JoinDemo extends Thread {
	static int i, sum=0;
	
	public static void main(String[] args) {
		 
		System.out.println("We are printing the sum of first 'i' number.");
		System.out.print("Enter a value of i: ");
		Scanner sc= new Scanner(System.in);
		JoinDemo.i=sc.nextInt();
			
		JoinDemo jd= new JoinDemo();
		jd.start();
		try {
			jd.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sum of first "+JoinDemo.i+" numbers is "+JoinDemo.sum);
	//we don't want to print this line until it completes the run method so we have to invoke join method
	}
	
	public void run(){
		for(int j=1;j<=JoinDemo.i;j++){
			JoinDemo.sum+=i;
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}

}
