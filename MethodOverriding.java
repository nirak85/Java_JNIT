//Method overriding in Java programming occurs when the method in the subclass has the same return type, or parameters, name or signature as the parent class. 
//Method overriding is the method by which Java can support runtime polymorphism.

class Fruit{
	void protein(){
		System.out.println("No protein");
	}
	void vitamin(){
		System.out.println("No vitamin");
	}
}
class Pineapple extends Fruit{
	void protein(){
		System.out.println("Pineapple is not a significant source of protein.");
	}
	void vitamin(){
		System.out.println("Pineapple is rich in vitaminC");
	}
}
class Guava extends Fruit{
	void protein(){
		System.out.println("Guava have high level of protein");
	}
	void vitamin(){
		System.out.println("Guava contains of vitaminC, potassium and fibre");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		Fruit f= new Fruit();
		f.protein();
		f.vitamin();
		f=new Pineapple();
		f.protein();
		f.vitamin();
		f=new Guava();
		f.protein();
		f.vitamin();
	}

}
