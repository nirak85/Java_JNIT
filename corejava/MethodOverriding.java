abstract class Laptop{
abstract void screenTouch();
abstract void cost();
void keyboard(){
System.out.println("All laptop has keyboard on it");
}
}
class Lenovo extends Laptop{
void screenTouch(){
System.out.println("Lenovo have screen touch display");
}
void cost(){
  System.out.println("The cost of Lenevo laptop is cheap");
}
}
class MacBook extends Laptop{
void screenTouch(){
System.out.println("MacBook have not screen touch display");
}
void cost(){
  System.out.println("The cost of Macbook is more than the Lenovo");
}
}
class MethodOverriding{
public static void main(String args[]){
Laptop obj= new Lenovo();
obj.keyboard();
obj.screenTouch();
obj.cost();
obj= new MacBook();
obj.keyboard();
obj.screenTouch();
obj.cost();
}
}
