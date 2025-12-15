<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name="frm" method="post" action="EmployeeController">
	 <table>
	 			<tr>
	 				<td>First Name</td>
	 				<td><input type="text" name="fname" placeholder="Enter First Name"></td>
	 			</tr>
	 			<tr>
	 				<td>Last Name</td>
	 				<td><input type="text" name="lname" placeholder="Enter Last Name"></td>
	 			</tr>
	 			<tr>
	 				<td>Email</td>
	 				<td><input type="text" name="email" placeholder="Enter Email"></td>
	 			</tr>
	 			
	 			<tr>
	 				<td>Job</td>
	 				<td><input type="text" name="job" placeholder="Enter Job"></td>
	 			</tr>
	 			<tr>
	 				<td>location</td>
	 				<td><input type="text" name="loc" placeholder="Enter Location"></td>
	 			</tr>
	 			<tr>
	 				<td>Dept Id</td>
	 				<td><input type="text" name="did" placeholder="Enter Dept Id"></td>
	 			</tr>
	 		<tr>
	 				<td colspan="2" align="center"><input type="submit" name="action" value="insert"></td>
	 			</tr>
	 		<tr>
	 				<td colspan="2" align="center"><a href="view.jsp">View Employee Data</a></td>
	 		</tr>
	 </table>
	</form>
</body>
</html>