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
#myInput {
  font-size: 16px;
  padding: 14px 20px 12px 45px;
  border: 1px solid #ddd;
  border-bottom: 1px solid #ddd;
}

#myInput:focus {outline: 3px solid #ddd;}

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
.show {display: block;}

#myUL {
  list-style-type: none;
  padding: 0;
  margin: 0;
}

#myUL li a {
  border: 1px solid #ddd;
  margin-top: -1px; /* Prevent double borders */
  background-color: #f6f6f6;
  padding: 12px;
  text-decoration: none;
  font-size: 18px;
  color: black;
  display: block
}

#myUL li a:hover:not(.header) {
  background-color: #eee;
</style>
<meta charset="ISO-8859-1">
<title>ABM Shopping App</title>
</head>
<body>
	
	<div class="navbar">
		<a href="">Home</a> 
		<a href="">Products</a>
		<a href="">Compare</a> 
	
		<div class="dropdown" >
			<button class="dropbtn">Categories</button>
			 <div class="dropdown-content">
				    <a href="#">Product 1</a>
				    <a href="#">Product 2</a>
				    <a href="#">Product 3</a>
				    <a href="#">Product 4</a>
			</div>
		</div>
		<div class="navbarloginandcart">
		<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">
		
		<a href=""style="float: right;">Login/SignUp</a>
		<a href="" style="float: right;">Cart</a>
		</div>
		
</div>
<ul id="myUL">
		  <li><a href="#">Samsung</a></li>
		  <li><a href="#">Motorola</a></li>
		  <li><a href="#">Iphone</a></li>
		  <li><a href="#">amul macho</a></li>
		  <li><a href="#">gucchi</a></li>
		  <li><a href="#">guess</a></li>
		  <li><a href="#">allen solly</a></li>
		</ul>

<script>

	var UL = document.getElementById("myUL");
	
	UL.style.display = "none";

	var searchBox = document.getElementById("myInput");

	
	searchBox.addEventListener("focus",  function(){
	    
	});

	
	searchBox.addEventListener("blur", function(){
	    UL.style.display = "none";
	});


	function myFunction() {
	    var input, filter, ul, li, a, i;
	    input = document.getElementById("myInput");
	    ul = document.getElementById("myUL");
	    filter = input.value.toUpperCase();
	    
	    if(filter.trim().length < 1) {
	        ul.style.display = "none";
	        return false;
	    } else {
	        ul.style.display = "block";
	    }
	    
	    li = ul.getElementsByTagName("li");
	    for (i = 0; i < li.length; i++) {
	        a = li[i].getElementsByTagName("a")[0];
	        
	        // This is when you want to find words that contain the search string
	     if (a.innerHTML.toUpperCase().indexOf(filter) > -1) { 
	        li[i].style.display = "";
	     } else {
	        li[i].style.display = "none";
	    } 
	    
	    
	    }
	}
</script>


</body>
</html>