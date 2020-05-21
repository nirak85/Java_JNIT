import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseSelect {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/company?serverTimezone=UTC";
		String username = "root";
		String password = "Nepal20.";
		//Get a connection to database
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null)
			System.out.println("Connection established");
		//create a statement
			Statement st = con.createStatement();
		//Execute sql query
			ResultSet rs= st.executeQuery("select * from employee");
			System.out.println("Empid 	Name  	Salary 	Department 	Position");
			System.out.println("----------------------------------------------------------------");
		// Process the result set
		while(rs.next()){
			System.out.println(rs.getInt(1)+"	"+rs.getString(2)+"	"+rs.getInt(3)+" 	"+rs.getString(4)+"		"+rs.getString(5));
		}
		}
	}


