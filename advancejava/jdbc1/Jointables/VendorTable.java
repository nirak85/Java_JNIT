package Jointables;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class VendorTable {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Capitalone?serverTimezone=UTC";
		String username = "root";
		String password = "Nepal20.";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null){
			System.out.println("Connection established");
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			int Vendor_id;
			String Vendor_name, temp;

			do {
				System.out.println("Enter the department details:");
				System.out.print("Vendor ID:");
				Vendor_id = sc.nextInt();
				System.out.print("Vendor Name: ");
				Vendor_name = sc.next();

				int x = st.executeUpdate("insert into Vendor values(" + Vendor_id + ",'" + Vendor_name + "')");
				if (x != 0) 
					System.out.println("Vendor record are inserted");
				System.out.println("Do you want to add more input(y/n)?");
				temp = sc.next();
			} while (temp.equals("y"));
		}
		System.out.println("GoodWork");
	}
}