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
		PreparedStatement ps= con.prepareStatement("insert into employee values(?,?,?,?,?)");
		//how many values we want we place those many "?". Here ? mark indicates the place holder in database
		ps.setInt(1, 15);
		ps.setString(2, "Amy");
		ps.setInt(3, 22000);
		ps.setString(4, "IT");
		ps.setString(5, "Junior");
		
		int x=ps.executeUpdate();
		if(x!=0)
			System.out.println("Record Inserted");
	
	}
}