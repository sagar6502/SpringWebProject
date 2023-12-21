<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
		<title> Login Please </title>
	</head>
	<body>
		<div class="container">
			<h1>Welcome</h1>
			<hr>
			<div>Dear : ${name}</div>
			<div><a href="list-todos"> Manage</a> Your Todos</div>
		</div>
		<script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
		
	</body>
</html>