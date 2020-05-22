package Jointables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DatabaseMetaData;

public class AddBatch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/company?serverTimezone=UTC";
		String username = "root";
		String password = "Nepal20.";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("System connected");

		Statement st = con.createStatement();
		st.addBatch("insert into employee values(11, 'Barney', 32000, 'Engineer', 'SRE')");
		st.addBatch("delete from employee where id=12");
		st.executeBatch();
	}
}
