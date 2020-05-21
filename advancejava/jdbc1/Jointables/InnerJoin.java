package Jointables;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InnerJoin {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Capitalone?serverTimezone=UTC";
		String username = "root";
		String password = "Nepal20.";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("Connection established");
		}
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select Emp_id, Emp_name, Department_name, Vendor_name from employee "
				+ "inner join Department on Department.Department_id = employee.Department_id "
				+ "inner join Vendor on Vendor.Vendor_id = employee.Vendor_id; ");

		System.out.println("Emp_id  Emp_name    Department_name    Vendor_name");
		System.out.println("--------------------------------------------------------");
		while(rs.next()) {
			
		System.out.println(rs.getInt(1)+"     "+ rs.getString(2)+ "              " + rs.getString(3)+ "          "+ rs.getString(4));
		}
	}

} 