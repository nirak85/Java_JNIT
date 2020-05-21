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
		//delete id
		PreparedStatement ps= con.prepareStatement("delete from employee where id in (?,?)");
		ps.setInt(1, 11);
		ps.setInt(2, 1);
		int x=ps.executeUpdate();
		if(x!=0)
			System.out.println("Record Deleted");
	
	}
}