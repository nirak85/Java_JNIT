package Jointables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DepartmentTable {

	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Capitalone?serverTimezone=UTC";
		String username = "root";
		String password = "Nepal20.";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("Connection established");
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			int Department_id;
			String Department_name, temp;

			do {
				System.out.println("Enter the department details:");
				System.out.print("Department Id:");
				Department_id = sc.nextInt();
				System.out.print("Department Name: ");
				Department_name = sc.next();

				int x = st.executeUpdate("insert into Department values(" + Department_id + ",'" + Department_name + "')");
				if (x != 0)
					System.out.println("Department record are inserted");
				System.out.println("Do you want to add more input(y/n)?");
				temp = sc.next();
			} while (temp.equals("y"));
		}
		System.out.println("GoodWork");
	}
}