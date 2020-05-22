import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

class Choice {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/company?serverTimezone=UTC";
		String username = "root";
		String password = "Nepal20.";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null)
			System.out.println("Connected to the system");

		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		String temp;
		do {
			System.out.print("Enter the choice(1.Insert 2.Display 3.Delete 4.Update): ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the choice Insert(1.All columns 2.particular coulmn(id,dream)): ");
				int insert = sc.nextInt();
				switch (insert) {
				case 1:
					ps = con.prepareStatement("insert into student values(?,?,?)");
					System.out.println("Enter the details of student.");
					System.out.print("Student Id: ");
					int id = sc.nextInt();
					ps.setInt(1, id);
					System.out.print("Student Name: ");
					String name = sc.next();
					ps.setString(2, name);
					System.out.print("Dream: ");
					String dream = sc.next();
					ps.setString(3, dream);
					int x = ps.executeUpdate();
					if (x != 0) {
						System.out.println("Student record inserted");
					}
					break;

				case 2:
					ps = con.prepareStatement("insert into student(id,dream) values(?,?)");
					System.out.print("Student id: ");
					int stu_id = sc.nextInt();
					ps.setInt(1, stu_id);
					System.out.print("Student dream: ");
					String stu_dream = sc.next();
					ps.setString(2, stu_dream);
					int y = ps.executeUpdate();
					if (y != 0) {
						System.out.println("Student record inserted");
					}
					break;
				default:
					System.out.println("Error");
					break;
				}
				break;

			case 2:
				System.out.print("Enter your choice to display(1.All rows & columns 2.particular row(id search): ");
				int display = sc.nextInt();
				switch (display) {
				case 1:
					ps = con.prepareStatement("select * from student");
					ResultSet rs = ps.executeQuery();
					System.out.println("S_Id    S_Name    S_Dream");
					System.out.println("----------------------------------------------");
					while (rs.next()) {
						System.out.println(rs.getInt(1) + "       " + rs.getString(2) + "       " + rs.getString(3));
					}
					break;
				case 2:
					ps = con.prepareStatement("select * from student where id=?");
					System.out.print("Search Student id: ");
					int id1 = sc.nextInt();
					ps.setInt(1, id1);
					ResultSet s = ps.executeQuery();
					while (s.next()) {
						System.out.println(s.getInt(1) + " " + s.getString(2) + " " + s.getString(3));
					}
					break;
				default:
					System.out.println("Error");
					break;
				}
				break;
			case 3:
				System.out.print("Enter your choice to delete(1.All rows 2.Particular row): ");
				int delete = sc.nextInt();
				switch (delete) {
				case 1:
					ps = con.prepareStatement("delete from student");
					int del_1 = ps.executeUpdate();
					break;
				case 2:
					ps = con.prepareStatement("delete from student where id=?");
					System.out.print("Delete student of id: ");
					int del_2 = sc.nextInt();
					ps.setInt(1, del_2);
					int del_3 = ps.executeUpdate();
					if (del_3 != 0)
						System.out.println("Record deleted.");
					break;

				default:
					System.out.println("Error");
					break;
				}
				break;

			case 4:
				System.out.print("Enter your choice Udate(1.Name 2.Dream): ");
				int update = sc.nextInt();
				switch (update) {
				case 1:
					ps = con.prepareStatement("update student set name=? where id=?");
					System.out.print("Enter student name: ");
					String new_name = sc.next();
					ps.setString(1, new_name);
					System.out.print("Enter student id: ");
					int id3 = sc.nextInt();
					ps.setInt(2, id3);

					int a = ps.executeUpdate();
					if (a != 0)
						System.out.println("Name changed");
					break;

				case 2:
					ps = con.prepareStatement("update student set dream=? where id=?");
					System.out.print("Enter student dream: ");
					String new_dream = sc.next();
					ps.setString(1, new_dream);
					System.out.print("Enter student id: ");
					int id4 = sc.nextInt();
					ps.setInt(2, id4);

					int a1 = ps.executeUpdate();
					if (a1 != 0)
						System.out.println("Dream changed");
					break;
				default:
					System.out.println("Error");
					break;
				}
				break;
			}
			System.out.print("Do you want to continue(y/n): ");
			temp = sc.next();
		} while (temp.equals("y"));
		System.out.println("Bye Bye");
	}

}