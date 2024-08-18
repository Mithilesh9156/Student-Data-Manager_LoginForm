<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="style.css">

</head>
<body>
	<h1>Login Form </h1>
	
				<div>
					<form action="login" method="post">
				
					userId: <input type="text" name="id"><br><br>			 <% request.getAttribute("key"); %>
					password: <input type="password" name="password"><br><br>  <p style="color: red; font-style: normal;"> ${key} <p>
					<input type="submit" /><br><br>
					
					</form>
				</div>
				
				
</body>
</html>

