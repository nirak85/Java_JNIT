<!DOCTYPE html>
<html>

<body bgcolor="olive">
	<center>
		<h1>Doctor Profile Update</h1>
	</center>
	<br>
	<br>
	<br>
	<%@page import="java.sql.*" %>
	
	 <%
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/appointment?serverTimezone=UTC";
		String username = "root";
		String password = "Nepal20.";
		
		Connection con = DriverManager.getConnection(url, username, password);
		String id = request.getParameter("id");
		int x= Integer.parseInt(id);
		PreparedStatement ps = con.prepareStatement("select * from doctor where id=?");
		ps.setInt(1,x);
		ResultSet rs= ps.executeQuery();
		if(rs.next()){
		%>
	<form action="./doctorprofile_update.jsp" method="post">
		<table align="center" width="200" height="100">
		
		<tr>
		<td><input type="hidden" name="id" value="<%=rs.getInt("id")%>"></td>
			</tr>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="user" value="<%=rs.getString("username")%>"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" value="<%=rs.getString("email")%>"></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><input type="text" name="phone" value="<%=rs.getInt("phone")%>"></td>
			</tr>
			<tr>
				<td>Specialist:</td>
				<td><input type="text" name="specialist" value="<%=rs.getString("specialist")%>"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update"></td>

			</tr>
		</table>
	</form>
<%
}
%>

</body>
</html>