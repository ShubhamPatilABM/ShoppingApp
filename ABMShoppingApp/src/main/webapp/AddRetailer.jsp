<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>ADD RETAILER</h1>
	<form action="newRetailer">


		<div>
			Retailer Name : <input name="retName" />
		</div>
		<br />

		<div>
			Retailer Mobile No. : <input name="retMob" />
		</div>
		<br />

		<div>
			Retailer E-mail : <input name="retEmail" />
		</div>
		<br />

		<div>
			Retailer Password : <input name="retPassword" />
		</div>
		<br />
		<div>
			<button type="submit">Open Account</button>
			<button type="submit">
				<a href="index.jsp">Home</a>
			</button>
		</div>

	</form>

</body>
</html>