<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="newUser">
		<h1>Open New Account</h1>	
		
		<div>
			Enter Name : <input name="userName"> <br>
		</div><br>
		
		<div>
			Enter user Email : <input name="userEmail"> <br>
		</div><br>
		
		<div>
			Enter user Password : <input name="userPassword"> <br>
		</div><br>
		
		<div>
			mobile Number : <input name="mobileNumber"> <br>
		</div><br>
		<div>
			<button type="submit">Open Account</button>
			<button type="submit"><a href="index.jsp">Home</a></button>
		</div>
	</form>
</body>
</html>