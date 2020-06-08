<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patient Home</title>
</head>
<body bgcolor="teal">
	<center>
		<h1>Patient Profile</h1>
	</center>
	<br>
	<br>
	<br>
	<table align="center" width="300" height="150">
		<tr>
			<td><a href="patient_profile.jsp ">Profile</a></td>
			<td><a href="index.html">Logout</a></td>
		</tr>
	</table>
	<br>
	<br>
	<br>
	<%@page import="java.sql.*"%>
	<table align="center" width="500" height="150" border="2">
<tr>
		<td>Patient ID</td>
		<td>Username</td>
		<td>Email</td>
		<td>Phone</td>
		
	</tr>
	<%
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/appointment?serverTimezone=UTC";
		String username = "root";
		String password = "Nepal20.";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = con.prepareStatement("select * from patient");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
	%>
	<tr>
		<td><%=rs.getInt("pid")%></td>
		<td><%=rs.getString("username")%></td>
		<td><%=rs.getString("email")%></td>
		<td><%=rs.getLong("phone")%></td>
	</tr>
	<%
		}
	%>
	</table>
</body>
</html>
