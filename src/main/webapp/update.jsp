<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="update.css">
</head>
<body>

		<label>Student Data by ID: </label>
		   <h2>${id}</h2>	<h2>${error}</h2> <h2>${success}</h2>
		


		<form action="updateForm" method="post">
			Enter Id: <input type="text" name="userId"><br><br><%-- <h4>${userIdError}</h4> --%>
			
			
			Enter Full Name: <input type="text" name="name"><br><br><%-- <h4>${nameError}</h4> --%>
				
			Email:  <input type="text" name="email"><br><br><%-- <h4>${emailError}</h4> --%>
				
			Phone No: <input type="text" name="phoneNo"><br><br><%-- <h4>${phoneNoError}</h4> --%>
				
			Fees: <input type="text" name="fees"><br><br><%-- <h4>${feesError}</h4> --%>
					
			Birth Date:  <input type="text"name="date"><br><br><%-- <h4>${dateError}</h4> --%>
			 
			Gender :  <input type="text" name="gender"> <br><br><%-- <h4>${genderError}</h4> --%>
			 		
			Course:  <input type="text" name="course"><br><br>  <%-- <h4>${courseError}</h4> --%>
			
			 <input type="submit"> 
			 
		</form>
		
		
		<form action="back">
			<input type="submit" value="Back">
		</form>
</body>
</html>

