class Calculation{ 
  int subtract(int a, int b) 
    { 
        return (a - b); 
    } 
  int product(int a, int b, int c) 
    { 
        return (a * b * c); 
    } 
double sum(double x, double y) 
    { 
        return (x + y); 
    } 
}
class constructorOverloading{
    public static void main(String args[]) 
    { 
        Calculation obj = new Calculation(); 
        System.out.println("Subtract= "+obj.subtract(7, 2)); 
        System.out.println("Product= "+obj.product(4, 5, 6)); 
        System.out.println("Sum= "+obj.sum(2.3, 8.9)); 
    } 
} 