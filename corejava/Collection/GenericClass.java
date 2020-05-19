import java.util.*;
class Generic<element>{
void show(element c){
System.out.println(c);
}
}
class GenericClass{
public static void main(String args[]){
Generic<Integer> i= new Generic<Integer>();
i.show(22);
Generic<Float> f= new Generic<Float>();
f.show(3.5f);
Generic<Double> d= new Generic<Double>();
d.show(1234.567);
Generic<String> s= new Generic<String>();
s.show("JNIT");
Generic<Long> l= new Generic<Long>();
l.show(12345678765432l);
}
} 