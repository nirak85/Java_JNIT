class Sibling{
	double height=5.7;
	
}
class Brother extends Sibling{
	double height= 5.5;
	void tall(){
		System.out.println("Sam is "+height+ " ft tall.");
		
		System.out.println("Miller is "+super.height+ " ft tall.");
	}
} 
public class SuperVariables {
	public static void main(String[] args) {
		Brother b= new Brother();
		b.tall();
	}

}
