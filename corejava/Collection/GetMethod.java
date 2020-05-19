import java.util.*;
class GetMethod{
public static void main(String args[]){
AbstractList<Integer> al= new ArrayList<Integer>();
al.add(11);
al.add(12);
al.add(22);
al.add(33);
al.add(44);
al.add(55);
al.add(66);
System.out.println(al);

int value= al.get(4);
System.out.println(value);

// Using set() method to replace 33 with 99
System.out.println("Replace: "+al.set(3,99));
System.out.println(al);

}
}