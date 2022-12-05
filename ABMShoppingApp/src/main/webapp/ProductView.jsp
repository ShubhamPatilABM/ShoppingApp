<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<label for="products">Choose a products:</label>
<form action="showProduct">
<select name="productCategory" id="products">
  <option value="top_ware">TOPS</option>
  <option value="bottom_ware">BOTTOMS</option>
  <option value="inner_ware">INNER</option>
</select>
<br><br>
<input type="submit" value="Submit">
</form>
	search Result: <br />
	ProductID : ${ product.productId } <br />
	ProductName : ${product.productName } <br />
	ProductPrice : ${product.productPrice } <br />
		<br />	
</body>
</html>