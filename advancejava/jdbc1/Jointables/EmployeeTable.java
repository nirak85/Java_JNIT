package Jointables;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

class EmployeeTable {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Capitalone?serverTimezone=UTC";
		String username = "root";
		String password = "Nepal20.";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("Connected to system");

			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			int Emp_id, Department_id, Vendor_id;
			String Emp_name, temp;

			do {
				System.out.println("Enter the employee details:");
				System.out.print("Employee ID:");
				Emp_id = sc.nextInt();
				System.out.print("Employee Name: ");
				Emp_name = sc.next();
				System.out.print("Department ID: ");
				Department_id = sc.nextInt();
				System.out.print("Vendor ID: ");
				Vendor_id = sc.nextInt();
				

				int x = st.executeUpdate("insert into employee values(" + Emp_id + ",'" + Emp_name + "'," + Department_id + ","+ Vendor_id + ")");
				if (x != 0)
					System.out.println("Employee record are inserted");
				System.out.println("Do you want to add more input(y/n)?");
				temp = sc.next();
			} while (temp.equals("y"));
		}
		System.out.println("GoodWork");
	}
}