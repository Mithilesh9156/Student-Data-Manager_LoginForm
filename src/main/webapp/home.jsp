<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>


		<h4> Login Successfully </h4><br><br><br><br>
		<h1>Welcome Admin </h1>

	<form action="insert" style="align-content: center;">
		<label>Click to Insert New Data: </label> <input type="submit" value="Insert"><br><br>
	</form>

	<form action="update" method="get">
		<label>Click to Update Data: </label><input type="submit" value="Update">
	</form>
	
	<form action="delete" style="align-content: center;">
		<label>Click to delete  Data: </label> <input type="submit" value="delete"><br><br>
	</form>
	
		<label> ${delete}</label>
		<label> ${insert}</label>
		<label> ${success}</label>

</body>
</html>

