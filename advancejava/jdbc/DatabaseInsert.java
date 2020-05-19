import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class DatabaseInsert {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/dbs?serverTimezone=UTC";
		String username = "root";
		String password = "Nepal20.";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null){
			System.out.println("Connection established");
			Statement st = con.createStatement();
			int x = st.executeUpdate("insert into employee values(1121,'Niraj',85000)");
			int y = st.executeUpdate("insert into employee values(1122,'Tshering',75000)");
			if (x!= 0) {
				System.out.println("Record Inserted");
			}
		}
	}
}