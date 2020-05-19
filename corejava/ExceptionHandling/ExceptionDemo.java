import java.util.Arrays;
import java.util.*;
class ExceptionDemo{
public static void main(String args[]){
int[] array= {1,2,3,4,5,6,7,8,9};
int x=40, y=5, z=0;
String s=null; 
String t="bottle";

System.out.println(Arrays.toString(array));

try{
System.out.println(array[11]);
}
catch(ArrayIndexOutOfBoundsException aiob){
System.out.println("Error! " +aiob);
}

try{
System.out.println(x/z+y);
}catch(ArithmeticException ae){
System.out.println("Error! "+ae+"\n"+"can't divide by zero");
}
finally{
    System.out.println("Finally block is always executed either exception is handle or not");
}

try{
System.out.println(s.length());
}catch(NullPointerException nul){
    System.out.println("Error! "+nul);
}
System.out.println(array[6]+x+array[8]);

try{
int i=Integer.parseInt(t);
System.out.println(i);
}catch(ClassCastException cce){
	System.out.println(cce);
}catch(NumberFormatException nfe){
    System.out.println("Error! "+nfe);
}  

try{
    System.out.println("I drank "+array[3]+t+"s beers");
}catch(Exception e){
System.out.println(e);
}

	}
  }