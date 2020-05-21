import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedInsert {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/company?serverTimezone=UTC";
		String username = "root";
		String password = "Nepal20.";
		// Get a connection to database
		Connection con = DriverManager.getConnection(url, username, password);
		//update salary
		PreparedStatement ps= con.prepareStatement("update employee set salary=? where id=?");
		//in preparestatement we use ? to insert value. here left to right rule is used. so we have to insert the value of salary first and then id
		ps.setInt(1, 50000);
		ps.setInt(2, 12);
		int x=ps.executeUpdate();
		if(x!=0)
			System.out.println("Record Inserted");
	
	}
}