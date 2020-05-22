package Jointables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/company?serverTimezone=UTC";
		String username = "root";
		String password = "Nepal20.";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("System connected");
		
		DatabaseMetaData dmd = con.getMetaData();
		System.out.println(dmd.getDriverName());
		System.out.println(dmd.getUserName());
		System.out.println(dmd.getDriverVersion());

	}

}