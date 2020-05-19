import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class DatabaseConnection{
public static void main(String args[])throws Exception{
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/dbs?serverTimezone=UTC";
String username= "root";
String password= "Nepal20.";
Connection con= DriverManager.getConnection(url,username,password);
if(con!=null)
System.out.println("Connection established");
}
}