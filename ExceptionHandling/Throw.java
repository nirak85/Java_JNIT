class Throw{
static void CustomerAge(int age){
if(age<=21)
throw new ArithmeticException("minor, not legal");
else
System.out.println("Eligible to buy alcohol and tobacco product");
}
public static void main(String args[]){
CustomerAge(23);
CustomerAge(20);
System.out.println("");
}
}