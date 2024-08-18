<!DOCTYPE html>
<html xmlns:th="http://thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="show.css">

</head>
<body>
			
			<table>
			
			<thead>
				<tr>
					<td>Name</td>
					<td>Email Id</td>
					<td>Phone No.</td>
					<td>fees</td>
					<td>Dob</td>
					<td>Gender</td>
					<td>Course</td>
				</tr>
			</thead>
			
			<tbody>
				<tr th:each="student:${students}">
					<td th:text="${student.userId}"></td>
					<td th:text="${student.email}"></td>
					<td th:text="${student.phoneNo}"></td>
					<td th:text="${student.fees}"></td>
					<td th:text="${student.date}"></td>
					<td th:text="${student.gender}"></td>
					<td th:text="${student.course}"></td>
				</tr>
			</tbody>
			
			</table>
			
</body>
</html>