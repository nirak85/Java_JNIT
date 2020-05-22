package Jointables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultsetMetadata {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/company?serverTimezone=UTC";
		String username = "root";
		String password = "Nepal20.";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("System connected");
		PreparedStatement ps = con.prepareStatement("select * from employee");
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("Total column: " + rsmd.getColumnCount());
		System.out.println("Column name of 1st "+ rsmd.getColumnName(1));
		System.out.println("Column name of 2st "+ rsmd.getColumnName(2));
		System.out.println("Column name of 3st "+ rsmd.getColumnName(3));
		System.out.println("Column type "+rsmd.getColumnTypeName(2));
		System.out.println("Column type "+rsmd.getColumnTypeName(3));
		

	}

}