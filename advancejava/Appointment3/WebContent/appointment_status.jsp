<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor Home</title>
</head>
<body bgcolor="teal">
	<center>
		<h1>Patient Home</h1>
	</center>
	<br>
	<br>
	<br>
	<table align="center" bgcolor="olive" width="500" height="150">
		<tr>
			<td><a href="patient_profile.jsp ">Profile</a></td>
			<td><a href="apply_appointment.jsp">Appointment</a></td>
			<td><a href="appointment_status.jsp">Appointment Status</a></td>
			<td><a href="index.html">Logout</a></td>
		</tr>
	</table>
	<br>
	<br>
	<br>
	<%@page import="java.sql.*"%>

	<table align="center" width="700" height="100" border="3">

		<td>Appointment ID</td>
		<td>Username</td>
		<td>Email</td>
		<td>Phone</td>
		<td>Specialist</td>
		<td>Date</td>
		<td>Time</td>
		<td>Status</td>
		</tr>
		<%
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/appointment?serverTimezone=UTC";
			String username = "root";
			String password = "Nepal20.";
			
			Object o=session.getAttribute("pid");
			int i=(Integer)o;
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			PreparedStatement ps = con.prepareStatement("select * from patient_appointment where pid=?");
			ps.setInt(1,i);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) { 
		%> 
		<tr>
			<td><%=rs.getInt("apid")%></td>
			<td><%=rs.getString("username")%></td> 
			<td><%=rs.getString("email")%></td>
			<td><%=rs.getLong("phone")%></td>
			<td><%=rs.getString("specialist")%></td>
			<td><%=rs.getString("appointment_date")%></td>
			<td><%=rs.getString("appointment_time")%></td>
			<td><%=rs.getString("status")%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>
