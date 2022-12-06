<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}

.navbar {
  overflow: hidden;
  background-color: #333;
}

.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="header">
		<a href="" class="logo">Shopping App</a>
	</div>
	<div class="navbar">
		<a href="">Log</a> 
		<a href="">Products</a>
		<a href="">Compare</a> 
		
		<!-- <label for="cars">Categories:</label> -->
		<div class="dropdown" >
			<button class="dropbtn" > Categories <i class="fa fa-caret-down"></i>
			</button>
			 <div class="dropdown-content">
				    <a href="#">Product 1</a>
				    <a href="#">Product 2</a>
				    <a href="#">Product 3</a>
				    <a href="#">Product 4</a>
			</div>
		</div>
		<div class="navbarloginandcart">
		<a href=""style="float: right;">Login/SignUp</a>
		<a href="" style="float: right;">Cart</a>
		</div>
		
</div>


</body>
</html>