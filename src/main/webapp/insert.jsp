<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="styless.css">
</head>
<body>
		<h1 style="color:navy; font-family: sans-serif;"> Insert Student Info. </h1>
		
	<div>
		<form action="form" method="post">
		
		Enter Full Name: 	<input type="text" name="name"><br><br>
				
			Email:  <input type="text" name="email"><br><br>
				
			 <label for="PhoneNo">Phone No: </label> 
			<input type="text" name="phoneNo"><br><br>
				
			Fees: <input type="text" name="fees"><br><br>
					
			Birth Date:  <input type="text"name="date"><br><br>
			 
			Gender :  <input type="text" name="gender"> 
			 		
			Course:  <input type="text" name="course">
			 
			
			<p> ${error} </p>
			<p>${instruct}</p>
			
			 <input type="submit"> 

		</form>
		
	</div>

</body>
</html>
