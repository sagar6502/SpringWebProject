<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
		<title> List Todos Page </title>
	</head>
	<body>
		<div class="container">
			
			<h1>Your todos are</h1>
			<table class="table">
				<thead> 
					<tr></tr>
						<th>id</th>
						<th>Description</th>
						<th>Target Date</th>
						<th>Is Done?</th>
						<th>Delete Data</th>
						<th>Update Data</th>
					<tr>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var="todo"> 
						<tr>
							<td>${todo.id}</td>
							<td>${todo.description}</td>
							<td>${todo.targetDate}</td>
							<td>${todo.done}</td>
							<td> <a href="delete-todo?id=${todo.id}" class="btn btn-warning"> DELETE ${todo.id}</a> </td>
							<td> <a href="update-todo?id=${todo.id}" class="btn btn-outline-primary">UPDATE ${todo.id}</a> </td>
						</tr>
					</c:forEach>
				</tbody>
				
			</table>
			<a href="add-todo" class="btn btn-success">Add Todo</a>
		</div>
		<script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
		
		
	</body>
</html>