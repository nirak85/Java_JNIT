class Animal{
	void cell(){
		System.out.println("Animal are multicellular organisms.");
	}
}
	class Mammal extends Animal{
	void mammalFeatures(){
		System.out.println("Mammal produce milk to feed their young.");
	}
}
	class Panda extends Animal{
		void pandaFeatures(){
			System.out.println("Panda is a cute animal.");
		}
	}

public class MultiLevelInheritance {
public static void main(String[] args) {
	Mammal obj1= new Mammal();
	obj1.cell();
	obj1.mammalFeatures();
	
	Panda obj2= new Panda();
	obj2.cell();
	obj2.pandaFeatures();
}
}

