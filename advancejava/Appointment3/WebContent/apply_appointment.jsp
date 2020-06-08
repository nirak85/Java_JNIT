<!DOCTYPE html>
<html>

<body bgcolor="peru">
	<center>
		<h1>Taking Appointment</h1>
	</center>
	<br>
	<br>
	<br>
	<form action="./appointment_apply.jsp" method="post">
		<table align="center" width="200" height="100">
			<tr>
				<td>Username:</td>
				<td><input type="text" name="user"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td>Specialist:</td>
				<td><input type="text" name="specialist"></td>
			</tr>
			<tr>
				<td>Date:</td>
				<td><input type="date" name="appointment_date"></td>
			</tr>
			<tr>
			 	<td>Time:</td>
				<td><input type="text" name="appointment_time"></td>
			</tr>
			<tr>

				<td><input type="submit" value="Apply"></td>

			</tr>
		</table>
	</form>


</body>
</html>