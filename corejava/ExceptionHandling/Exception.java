import java.util.*;
import java.util.Scanner;

class Exception{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");//if we input decimal number or  string

try{
int number= sc.nextInt();
System.out.println(number);
}
catch(InputMismatchException ime){
System.out.println("Error! "+ime);
}
finally{
    System.out.println("execute the program either exception is s handle or not");
}

}
}