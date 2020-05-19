public class ArmstrongNumber
{
	public static void main(String[] args) {
	int n=153, x=0, rem=0;
	for(x=0; n>0; n=n/10){
	    rem=n%10;
	    x=x+rem*rem*rem;
	}
	    System.out.println("sum= "+x);
	    
	}
    
}