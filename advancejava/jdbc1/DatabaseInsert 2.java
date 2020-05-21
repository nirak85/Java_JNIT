import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
class DatabaseInsert {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/company?serverTimezone=UTC";
		String username = "root";
		String password = "Nepal20.";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("Connected to system");

			Statement st = con.createStatement();
			//update salary

				int x = st.executeUpdate("update employee set salary=salary+700 where id in (1,13)");
				if (x != 0)
					System.out.println("Record inserted");
				
		System.out.println("Completed");
	}
}
}