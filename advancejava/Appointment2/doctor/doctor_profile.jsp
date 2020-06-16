<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor Home</title>
</head>
<body bgcolor="teal">
	<center>
		<h1>Doctor Profile</h1>
	</center>
	<br>
	<br>
	<br>
	<table align="center" width="300" height="150">
	<tr>
	<td><a href="doctor_profile.jsp">Profile</a></td>
	<td><a href="index.html">Logout</a></td>
	</tr></table>
	<br>
	<br>
	<br>
	<%@page import="java.sql.*" %>
	
	<table align="center" width="500" height="150" border="2">
<tr>
		<td>Doctor ID</td>
		<td>Username</td>
		<td>Email</td>
		<td>Phone</td>
		<td>Specialist</td>
		<td>Action</td>
	</tr>
	<%
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/appointment?serverTimezone=UTC";
		String username = "root";
		String password = "Nepal20.";
		
		Connection con = DriverManager.getConnection(url, username, password);
		Object ob= session.getAttribute("id");
		int id=(Integer)ob;
		
		PreparedStatement ps = con.prepareStatement("select * from doctor where id=?");
		ps.setInt(1,id);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
	%>
	<tr>
		<td><%=rs.getInt("id")%></td>
		<td><%=rs.getString("username")%></td>
		<td><%=rs.getString("email")%></td>
		<td><%=rs.getLong("phone")%></td>
		<td><%=rs.getString("specialist")%></td>
		<td><a href ="updateprofile_doctor.jsp?id=<%=rs.getInt("id")%>">Update</a></td>
	</tr>
	<%
		}
	%>
	</table>
</body>
</html>
