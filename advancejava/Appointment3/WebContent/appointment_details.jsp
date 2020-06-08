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
	<table align="center" width="300" height="100">
		<tr>
			<td><a href="doctor_profile.jsp">Profile</a></td>
			<td><a href="index.html">Logout</a></td>
		</tr>
	</table>
	<br>
	<br>
	<br>
	<%@page import="java.sql.*"%>

	<table align="center" width="700" height="100" border="3">
		<tr>
			<td>Appointment ID</td>
			<td>Username</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Specialist</td>
			<td>Date</td>
			<td>Time</td>
			<td>Action</td>
		</tr>
		<%
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/appointment?serverTimezone=UTC";
			String username = "root";
			String password = "Nepal20.";
			Connection con = DriverManager.getConnection(url, username, password);
			String specialist = (String) session.getAttribute("specialist");

			PreparedStatement ps = con.prepareStatement("select * from patient_appointment where specialist=?");
			ps.setString(1, specialist);
			String user=(String)session.getAttribute("user");
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
			<td>
				<%
					if(rs.getString("status").equals("Accepted by "+user)) {
				%> Accepted <%
					} else {
				%>
				<a href="accept.jsp?id=<%=rs.getInt("apid")%>">Accept</a>
			</td>
			<%
				}
			%>
		</tr>

		<%
			}
		%>

	</table>
</body>
</html>

