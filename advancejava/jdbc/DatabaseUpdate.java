import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class DatabaseUpdate {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/dbs?serverTimezone=UTC";
		String username = "root";
		String password = "Nepal20.";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null)
			System.out.println("Connection established");
		Statement st = con.createStatement();
		int x = st.executeUpdate("update employee set salary=95000 where id= 1121");
		if (x != 0)
			System.out.println("Record Inserted");
	}
}