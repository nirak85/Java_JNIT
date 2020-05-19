import java.util.Scanner;
class Calculator{
	int x, y, z;
	Scanner obj= new Scanner(System.in);
	
	void value(){
		System.out.println("Enter the number:");
		x= obj.nextInt();
		y= obj.nextInt();
		z= obj.nextInt();
	}
}
class Product extends Calculator{
	void product_total(){
		System.out.println("Product is "+(x*y*z));
	}
}
class Addition extends Calculator{
	void sum(){
		System.out.println("Sum is "+(x+y+z));
	}
	
}
class Simplify extends Calculator{
	void result(){
		System.out.println("Result of ((y+z)/x) is "+((y+z)/x));
	}
}
public class HierarichalInheritance {
	public static void main(String[] args) {
		Product a= new Product();
		a.value();
		a.product_total();
		Addition aa= new Addition();
		aa.value();
		aa.sum();
		Simplify aaa= new Simplify();
		aaa.value();
		aaa.result();
	}

}
