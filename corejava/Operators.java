public class Operators
{
	public static void main(String[] args) {
	//increment and decrement operators
	int x=10;
	int y;
	System.out.println(y=++x);
	System.out.println(y=x++);
	System.out.println(y++ + ++y);

	System.out.println(--x);
	System.out.println(x--);	
	
	//Arithmetic operators
	int a=2;
	int b=7;
	System.out.println(x+y-a*x/b%a);
	System.out.println(x%4);    //remainder is 2
	
	//Left and right shift operators
	System.out.println(30<<2);  //30*2^2=30*4=120  
	System.out.println(36>>2);  //36/2^2=36/4=9  
	
	//Relational and equality operators
	System.out.println(a!=b);
	System.out.println(x/a==5);
	System.out.println(a>b); //F
	System.out.println(a<b); //T
	System.out.println(a>=b); //F
	System.out.println(a<=b);  //T
	
	//Logical and Bitwise operators
	System.out.println(a>b&b>a*3); // F & F = F
	System.out.println(a<b&&a<=b); // T & T = T
	System.out.println(a>=b&&a<=b); // F & T = F
	
	System.out.println(a>b||a<b);   // F or T = T
	System.out.println(a>b||a>=b);  // F or F = F
	System.out.println(a<b||a<=b); // T or T = T
	
	int d=123456789;
	//long e=0123456789L;
	System.out.println("Integer can store upto 9 numbers= "+d);
//	System.out.println("Long can store upto 10 numbers= "+e);


    //Assignment operators(Simple, chained, compound)
    int f=8;
    int p,q,r,s;
    p=q=r=s=75;
    System.out.println(f);
    System.out.println(p+q+r+s);
    System.out.println(p+=f);
    System.out.println(s/=15);
    System.out.println(r+=q);
    
    //Simple if
    if(a>b){
    System.out.println("a is greater than b");
    }
    else
        System.out.println("a is smaller than b");
	}
}
