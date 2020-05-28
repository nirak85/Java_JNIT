<%@ page import="java.sql.*" %>
	
	 <%
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/appointment?serverTimezone=UTC";
		String username = "root";
		String password = "Nepal20.";
		
		Connection con = DriverManager.getConnection(url, username, password);
		String user= request.getParameter("user");
		String email= request.getParameter("email");
		int phone=Integer.parseInt(request.getParameter("phone"));
		String specialist= request.getParameter("specialist");
		String appointment_date= request.getParameter("appointment_date");
		String appointment_time= request.getParameter("appointment_time");

		PreparedStatement ps= con.prepareStatement("insert into patient_appointment(username, email, phone, specialist, appointment_date, appointment_time) values(?,?,?,?,?,?)");
		ps.setString(1,user);
		ps.setString(2,email);
		ps.setInt(3,phone);
		ps.setString(4,specialist);
		ps.setString(5,appointment_date);
		ps.setString(6,appointment_time);
		int y= ps.executeUpdate();
		if(y!=0)
			response.sendRedirect("./patient_home.html?msg=Applied"); 
		
		%> 