class Pet{
	void happy(){
		System.out.println("Pet makes you happy");
	}
}
class Dog extends Pet{
	void happy(){
		System.out.println("Dog are cute and adorable. Dog are loyable pet.");
	}
}
class Cat extends Pet{
	void happy(){
		System.out.println("Cat are cute and preety. I am scare of cat.");
	}
}
public class MethodOverriding2 {
public static void main(String[] args) {
	Pet p= new Pet();
	p.happy();
		p=new Dog();
		p.happy();
		p=new Cat();
		p.happy();
	
}
}
