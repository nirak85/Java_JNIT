import java.util.Stack;
class StackDemo{
public static void main(String args[]){
Stack<String> ss= new Stack<String>();
ss.push("G");
ss.push("O");
ss.push("O");
ss.push("D");
ss.push("L");
ss.push("U");
ss.push("C");
ss.push("K");

System.out.println(ss);


 ss.pop();
System.out.println(ss);


System.out.println(ss.peek());


}
}