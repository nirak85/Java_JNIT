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
			Scanner sc = new Scanner(System.in);
			int id, salary;
			String name, department, position, temp;

			do {
				System.out.println("Enter the employee details:");
				System.out.print("Employee id:");
				id = sc.nextInt();
				System.out.print("Employee Name: ");
				name = sc.next();
				System.out.print("Employee Salary: ");
				salary = sc.nextInt();
				System.out.print("Employee Department: ");
				department = sc.next();
				System.out.print("Employee Position: ");
				position = sc.next();

				int x = st.executeUpdate("insert into employee values(" + id + ",'" + name + "'," + salary + ",'"
						+ department + "','" + position + "')");
				if (x != 0)
					System.out.println("Record inserted");
				System.out.println("Do you want to add more input(y/n)?");
				temp = sc.next();
			} while (temp.equals("y"));
		}
		System.out.println("Completed");
	}
}