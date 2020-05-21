 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedInsert {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/company?serverTimezone=UTC";
		String username = "root";
		String password = "Nepal20.";
		// Get a connection to database
		Connection con = DriverManager.getConnection(url, username, password);
	
		PreparedStatement ps= con.prepareStatement("select * from employee where id=?");
		ps.setInt(1, 15);
		ResultSet rs= ps.executeQuery();
		System.out.println("Empid 	Name  	Salary 	Department 	Position");
		System.out.println("----------------------------------------------------------------");
		while(rs.next()){
			System.out.println(rs.getInt(1)+"	"+rs.getString(2)+"	"+rs.getInt(3)+" 	"+rs.getString(4)+"		"+rs.getString(5));
		}
	
	}
}